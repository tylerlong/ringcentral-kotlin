package com.ringcentral;

import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.text.MessageFormat;

public class RestException extends Exception {
    public Request request;
    public Response response;

    public RestException(Request request, Response response) throws IOException {
        super(MessageFormat.format("HTTP status code: {0}\n\n{1}", response.code(), response.body().string()));
        this.request = request;
        this.response = response;
    }
}
