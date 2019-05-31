package com.ringcentral;

import com.alibaba.fastjson.JSON;
import com.ringcentral.definitions.GetExtensionInfoResponse;
import com.ringcentral.definitions.TokenInfo;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ModelsTest {
    @Test
    public void testParseObject() throws IOException, RestException {
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
        ResponseBody responseBody = rc.get("/restapi/v1.0/account/~/extension/~", null);
        String responseString = responseBody.string();
        GetExtensionInfoResponse extensionInfo = JSON.parseObject(responseString, GetExtensionInfoResponse.class);
        assertNotNull(extensionInfo);
        assertNotNull(extensionInfo.extensionNumber);

        rc.revoke();
    }
}