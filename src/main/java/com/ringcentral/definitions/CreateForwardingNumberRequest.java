package com.ringcentral.definitions;


public class CreateForwardingNumberRequest {
    /// <summary>
    /// Forwarding/Call flip phone number
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Forwarding/Call flip number title
    /// </summary>
    public String label;

    /// <summary>
    /// Forwarding/Call flip phone type. If specified, 'label' attribute value is ignored. The default value is 'Other'
    /// Enum: PhoneLine, Home, Mobile, Work, Other
    /// </summary>
    public String type;

    /// <summary>
    /// Reference to the other extension device. Applicable for 'PhoneLine' type only. Cannot be specified together with 'phoneNumber' parameter.
    /// </summary>
    public CreateForwardingNumberDeviceInfo device;
}
