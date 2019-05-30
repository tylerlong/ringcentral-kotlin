package com.ringcentral.definitions;


public class PhoneNumberResource {
    /**
     *
     */
    public String formattedPhoneNumber;

    /**
     *
     */
    public String phoneNumber;

    /**
     *
     */
    public String type;

    /**
     * Custom user name of a phone number, if any
     */
    public String label;

    /**
     * Usage type of a phone number
     * Enum: MobileNumber, ContactNumber, DirectNumber, ForwardedNumber
     */
    public String usageType;
}
