package com.ringcentral.definitions;


public class DeviceInfoRequest {
    /**
     * Device unique identifier, retrieved on previous session (if any)
     */
    public String id;

    /**
     * For iOS devices only Certificate name (used by iOS applications for APNS subscription)
     */
    public String appExternalId;

    /**
     * For SoftPhone only Computer name
     */
    public String computerName;
}
