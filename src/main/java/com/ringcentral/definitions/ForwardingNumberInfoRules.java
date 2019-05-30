package com.ringcentral.definitions;


public class ForwardingNumberInfoRules {
    /**
     * Link to a forwarding number resource
     */
    public String uri;

    /**
     * Internal identifier of a forwarding number
     */
    public String id;

    /**
     * Phone number to which the call is forwarded
     */
    public String phoneNumber;

    /**
     * Title of a forwarding number
     */
    public String label;

    /**
     * Type of a forwarding number
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;
}
