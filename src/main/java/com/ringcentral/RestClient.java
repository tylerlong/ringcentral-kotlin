package com.ringcentral;

import com.alibaba.fastjson.JSON;
import com.ringcentral.definitions.GetTokenRequest;
import com.ringcentral.definitions.RevokeTokenRequest;
import com.ringcentral.definitions.TokenInfo;
import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.Base64;

public class RestClient {
    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");

    public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
    public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";

    public String clientId;
    public String clientSecret;
    public String server;
    public OkHttpClient httpClient;
    public TokenInfo token;

    public RestClient(String clientId, String clientSecret, String server, OkHttpClient okHttpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.server = server;
        if (okHttpClient == null) {
            this.httpClient = new OkHttpClient();
        } else {
            this.httpClient = okHttpClient;
        }
    }

    public RestClient(String clientId, String clientSecret, String server) {
        this(clientId, clientSecret, server, null);
    }

    public RestClient(String clientId, String clientSecret, Boolean production, OkHttpClient okHttpClient) {
        this(clientId, clientSecret, production ? PRODUCTION_SERVER : SANDBOX_SERVER, okHttpClient);
    }

    public RestClient(String clientId, String clientSecret, Boolean production) {
        this(clientId, clientSecret, production, null);
    }


    private String basicKey() {
        return new String(Base64.getEncoder().encode(MessageFormat.format("{0}:{1}", clientId, clientSecret).getBytes()));
    }

    private String authorizationHeader() {
        if (token != null) {
            return MessageFormat.format("Bearer {0}", token.access_token);
        }
        return MessageFormat.format("Basic {0}", basicKey());
    }

    public void revoke() throws IllegalAccessException, IOException, RestException
    {
        if(token == null)
        {
            return;
        }
        RevokeTokenRequest revokeTokenRequest = new RevokeTokenRequest();
        revokeTokenRequest.token = token.access_token;
        token = null;
        post("/restapi/oauth/revoke", null, revokeTokenRequest, ContentType.FORM);
    }

    public TokenInfo authorize(String username, String extension, String password) throws IllegalAccessException, IOException, RestException {
        GetTokenRequest getTokenRequest = new GetTokenRequest();
        getTokenRequest.username = username;
        getTokenRequest.extension = extension;
        getTokenRequest.password = password;
        getTokenRequest.grant_type = "password";
        return authorize(getTokenRequest);
    }

    public TokenInfo authorize(GetTokenRequest getTokenRequest) throws IllegalAccessException, IOException, RestException {
        token = null;
        ResponseBody responseBody = post("/restapi/oauth/token", null, getTokenRequest, ContentType.FORM);
        token = JSON.parseObject(responseBody.string(), TokenInfo.class);
        return token;
    }

    public ResponseBody get(String endpoint, Object queryParameters) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.GET, endpoint, queryParameters, null);
    }

    public ResponseBody delete(String endpoint, Object queryParameters) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.DELETE, endpoint, queryParameters, null);
    }

    public ResponseBody post(String endpoint, Object queryParameters, Object object) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.POST, endpoint, queryParameters, object, ContentType.JSON);
    }
    public ResponseBody post(String endpoint, Object queryParameters, Object object, ContentType contentType) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.POST, endpoint, queryParameters, object, contentType);
    }

    public ResponseBody put(String endpoint, Object queryParameters, Object object) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.PUT, endpoint, queryParameters, object);
    }

    public ResponseBody patch(String endpoint, Object queryParameters, Object object) throws IllegalAccessException, IOException, RestException {
        return request(HttpMethod.PATCH, endpoint, queryParameters, object);
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, Object body) throws IOException, RestException, IllegalAccessException {
        return request(httpMethod, endpoint,queryParameters, body, ContentType.JSON);
    }
    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, Object body, ContentType contentType)  throws IOException, RestException, IllegalAccessException {
        RequestBody requestBody = null;
        switch (contentType) {
            case JSON:
                requestBody = RequestBody.create(jsonMediaType, JSON.toJSONString(body));
                break;
            case FORM:
                FormBody.Builder formBodyBuilder = new FormBody.Builder();
                for (Field field : body.getClass().getFields()) {
                    Object value = field.get(body);
                    if (value != null) {
                        formBodyBuilder = formBodyBuilder.add(field.getName(), value.toString());
                    }
                }
                requestBody = formBodyBuilder.build();
                break;
            default:
                break;
        }
        return request(httpMethod, endpoint, queryParameters, requestBody);
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, RequestBody requestBody) throws IOException, RestException, IllegalAccessException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(server).newBuilder(endpoint);

        if (queryParameters != null) {
            for (Field field : queryParameters.getClass().getFields()) {
                Object value = field.get(queryParameters);
                if (value != null) {
                    urlBuilder = urlBuilder.addQueryParameter(field.getName(), value.toString());
                }
            }
        }

        HttpUrl httpUrl = urlBuilder.build();

        Request.Builder builder = new Request.Builder().url(httpUrl);
        switch (httpMethod) {
            case GET:
                builder = builder.get();
                break;
            case POST:
                builder = builder.post(requestBody);
                break;
            case PUT:
                builder = builder.put(requestBody);
                break;
            case DELETE:
                builder = builder.delete();
                break;
            case PATCH:
                builder = builder.patch(requestBody);
                break;
            default:
                break;
        }


        String userAgentHeader = String.format("RC-JAVA-SDK Java %s %s", System.getProperty("java.version"), System.getProperty("os.name"));
        Request request = builder.addHeader("Authorization", authorizationHeader())
                .addHeader("X-User-Agent", userAgentHeader)
                .build();

        Response response = httpClient.newCall(request).execute();
        int statusCode = response.code();
        if (statusCode < 200 || statusCode > 299) {
            throw new RestException(request, response);
        }
        return response.body();
    }
}
