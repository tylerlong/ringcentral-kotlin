package com.ringcentral;

import com.ringcentral.definitions.TokenInfo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Base64;

public class RestClient {
    public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
    public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";

    public String clientId;
    public String clientSecret;
    public String server;
    public OkHttpClient httpClient;
    public TokenInfo token;

    public RestClient(String clientId, String clientSecret, String server, OkHttpClient okHttpClient)
    {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.server = server;
        if(okHttpClient == null) {
            this.httpClient = new OkHttpClient();
        } else {
            this.httpClient = okHttpClient;
        }
    }
    public RestClient(String clientId, String clientSecret, String server)
    {
       this(clientId, clientSecret, server, null);
    }

    public RestClient(String clientId, String clientSecret, Boolean production, OkHttpClient okHttpClient)
    {
        this(clientId, clientSecret, production ? PRODUCTION_SERVER : SANDBOX_SERVER, okHttpClient);
    }
    public RestClient(String clientId, String clientSecret, Boolean production)
    {
        this(clientId, clientSecret, production, null);
    }


    private String basicKey() {
        return new String(Base64.getEncoder().encode(MessageFormat.format("{0}:{1}", clientId, clientSecret).getBytes()));
    }

    private String authorizationHeader() {
        if (token != null) {
            return MessageFormat.format("Bearer {0}",token.access_token);
        }
        return MessageFormat.format("Basic {0}", basicKey());
    }

    public ResponseBody request(Request.Builder builder) throws IOException, RestException {
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
