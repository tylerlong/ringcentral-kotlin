package com.ringcentral.definitions;


public class UpdateForwardingNumberRequest {
    /**
     * Forwarding/Call flip phone number
     */
    public String phoneNumber;

    /**
     * Forwarding/Call flip number title
     */
    public String label;

    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     */
    public String flipNumber;

    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;
}
