package com.ringcentral.definitions;


public class UpdateForwardingNumberRequest {
    /// <summary>
    /// Forwarding/Call flip phone number
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Forwarding/Call flip number title
    /// </summary>
    public String label;

    /// <summary>
    /// Number assigned to the call flip phone number, corresponds to the shortcut dial number
    /// </summary>
    public String flipNumber;

    /// <summary>
    /// Forwarding phone number type
    /// Enum: Home, Mobile, Work, PhoneLine, Outage, Other
    /// </summary>
    public String type;
}
