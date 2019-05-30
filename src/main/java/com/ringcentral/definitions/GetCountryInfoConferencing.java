package com.ringcentral.definitions;


public class GetCountryInfoConferencing {
    /// <summary>
    /// Internal identifier of a country
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a country
    /// </summary>
    public String uri;

    /// <summary>
    /// Country calling code defined by ITU-T recommendations [E.123](https://www.itu.int/rec/T-REC-E.123-200102-I/en) and [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
    /// </summary>
    public String callingCode;

    /// <summary>
    /// Emergency calling feature availability/emergency address requirement indicator
    /// </summary>
    public Boolean emergencyCalling;

    /// <summary>
    /// Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
    /// </summary>
    public String isoCode;

    /// <summary>
    /// Official name of a country
    /// </summary>
    public String name;
}
