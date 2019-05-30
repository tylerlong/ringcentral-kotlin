package com.ringcentral.definitions;


public class ParsePhoneNumberParameters {
    /// <summary>
    /// Internal identifier of a home country. The default value is ISO code (ISO 3166) of the user's home country or brand country, if the user is undefined
    /// </summary>
    public String homeCountry;

    /// <summary>
    /// The default value is 'False'. If 'True', the numbers that are closer to the home country are given higher priority
    /// </summary>
    public Boolean nationalAsPriority;
}
