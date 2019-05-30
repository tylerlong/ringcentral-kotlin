package com.ringcentral.definitions;


public class ForwardingNumberInfo {
    /// <summary>
    /// Internal identifier of a forwarding/call flip phone number
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a forwarding/call flip phone number
    /// </summary>
    public String uri;

    /// <summary>
    /// Forwarding/Call flip phone number
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Forwarding/Call flip number title
    /// </summary>
    public String label;

    /// <summary>
    /// Type of option this phone number is used for. Multiple values are accepted
    /// </summary>
    public String[] features;

    /// <summary>
    /// Number assigned to the call flip phone number, corresponds to the shortcut dial number
    /// </summary>
    public Long flipNumber;

    /// <summary>
    /// Forwarding phone number type
    /// Enum: Home, Mobile, Work, PhoneLine, Outage, Other
    /// </summary>
    public String type;
}
