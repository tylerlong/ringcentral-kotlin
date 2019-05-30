package com.ringcentral;

import com.ringcentral.definitions.TokenInfo;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class RestClientTest {
    @Test
    public void testAuthorize() throws IllegalAccessException, IOException, RestException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        TokenInfo token = rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );
        assertNotNull(token.access_token);
    }
}