package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateUserProfileImageRequest;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BinaryTest {
    @Test
    public void uploadProfileImage() throws IOException, RestException {
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

        String str = rc.restapi().account().extension().profileimage().post(new CreateUserProfileImageRequest()
                .image(new Attachment()
                        .fileName("test.png")
                        .contentType("image/png")
                        .bytes(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
                ));

        rc.revoke();
    }
}
