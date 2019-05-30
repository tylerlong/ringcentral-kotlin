package com.ringcentral.definitions;


public class ParsePhoneNumberResponse {
    /// <summary>
    /// Canonical URI of a resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Information on a user home country
    /// Required
    /// </summary>
    public GetCountryInfoNumberParser[] homeCountry;

    /// <summary>
    /// Parsed phone numbers data
    /// Required
    /// </summary>
    public PhoneNumberInfoNumberParser[] phoneNumbers;
}
