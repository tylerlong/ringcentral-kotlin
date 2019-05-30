package com.ringcentral.definitions;


public class GetCountryInfoNumberParser {
    /// <summary>
    /// Internal identifier of a country
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a country
    /// </summary>
    public String uri;

    /// <summary>
    /// Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
    /// </summary>
    public String callingCode;

    /// <summary>
    /// Emergency calling feature availability/emergency address requirement indicator
    /// </summary>
    public Boolean emergencyCalling;

    /// <summary>
    /// Country code according to the ISO standard, see ISO 3166
    /// </summary>
    public String isoCode;

    /// <summary>
    /// Official name of a country
    /// </summary>
    public String name;
}
