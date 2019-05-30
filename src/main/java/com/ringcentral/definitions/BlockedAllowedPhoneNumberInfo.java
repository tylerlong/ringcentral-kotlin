package com.ringcentral.definitions;


// Information on a blocked/allowed phone number
public class BlockedAllowedPhoneNumberInfo {
    /**
     * Link to a blocked/allowed phone number
     */
    public String uri;

    /**
     * Internal identifier of a blocked/allowed phone number
     */
    public String id;

    /**
     * A blocked/allowed phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;

    /**
     * Custom name of a blocked/allowed phone number
     */
    public String label;

    /**
     * Status of a phone number
     * Enum: Blocked, Allowed
     */
    public String status;
}
