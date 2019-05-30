package com.ringcentral.definitions;


public class CreateSipRegistrationRequest {
    /**
     * Device unique description
     * Required
     */
    public DeviceInfoRequest[] device;

    /**
     * SIP settings for device
     * Required
     */
    public SIPInfoRequest[] sipInfo;
}
