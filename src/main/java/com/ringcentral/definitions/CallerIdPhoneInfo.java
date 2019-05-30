package com.ringcentral.definitions;


public class CallerIdPhoneInfo {
    /// <summary>
    /// Internal identifier of a phone number
    /// </summary>
    public String id;

    /// <summary>
    /// Link to a phone number resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
    /// </summary>
    public String phoneNumber;
}
