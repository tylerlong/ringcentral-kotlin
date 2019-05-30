package com.ringcentral.definitions;


public class ForwardingNumberInfoRules {
    /// <summary>
    /// Link to a forwarding number resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a forwarding number
    /// </summary>
    public String id;

    /// <summary>
    /// Phone number to which the call is forwarded
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Title of a forwarding number
    /// </summary>
    public String label;

    /// <summary>
    /// Type of a forwarding number
    /// Enum: Home, Mobile, Work, PhoneLine, Outage, Other
    /// </summary>
    public String type;
}
