package com.ringcentral;

import com.ringcentral.definitions.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SmsTest {
    @Test
    public void sendSms() throws IOException, RestException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        CreateSMSMessage requestBody = new CreateSMSMessage();
        requestBody.text="hello world";
        requestBody.from = new MessageStoreCallerInfoRequest();
        requestBody.from.phoneNumber = System.getenv("RINGCENTRAL_USERNAME");
        MessageStoreCallerInfoRequest callee = new MessageStoreCallerInfoRequest();
        callee.phoneNumber = System.getenv("RINGCENTRAL_RECEIVER");
        requestBody.to = new MessageStoreCallerInfoRequest[]{callee};

        GetMessageInfoResponse response = rc.restapi().account().extension().sms().post(requestBody);
        assertNotNull(response);
        assertNotNull(response.subject);
        assertTrue(response.subject.contains("hello world"));

        rc.revoke();
    }

//    @Test
//    public void testListCountry() throws IOException, RestException {
//        RestClient rc = new RestClient(
//                System.getenv("RINGCENTRAL_CLIENT_ID"),
//                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
//                System.getenv("RINGCENTRAL_SERVER_URL")
//        );
//
//        TokenInfo token = rc.authorize(
//                System.getenv("RINGCENTRAL_USERNAME"),
//                System.getenv("RINGCENTRAL_EXTENSION"),
//                System.getenv("RINGCENTRAL_PASSWORD")
//        );
//
//
//
//        rc.revoke();
//    }
}
