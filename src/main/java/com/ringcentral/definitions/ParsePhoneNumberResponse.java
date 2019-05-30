package com.ringcentral.definitions;


public class ParsePhoneNumberResponse {
    /**
     * Canonical URI of a resource
     */
    public String uri;

    /**
     * Information on a user home country
     * Required
     */
    public GetCountryInfoNumberParser[] homeCountry;

    /**
     * Parsed phone numbers data
     * Required
     */
    public PhoneNumberInfoNumberParser[] phoneNumbers;
}
