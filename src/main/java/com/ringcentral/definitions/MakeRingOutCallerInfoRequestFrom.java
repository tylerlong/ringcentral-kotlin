package com.ringcentral.definitions;


public class MakeRingOutCallerInfoRequestFrom {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    /**
     * Internal identifier of a forwarding number; returned in response as an 'id' field value. Can be specified instead of the phoneNumber attribute
     */
    public String forwardingNumberId;
}
