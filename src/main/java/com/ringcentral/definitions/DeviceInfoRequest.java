package com.ringcentral.definitions;


public class DeviceInfoRequest {
    /// <summary>
    /// Device unique identifier, retrieved on previous session (if any)
    /// </summary>
    public String id;

    /// <summary>
    /// For iOS devices only Certificate name (used by iOS applications for APNS subscription)
    /// </summary>
    public String appExternalId;

    /// <summary>
    /// For SoftPhone only Computer name
    /// </summary>
    public String computerName;
}
