package com.ringcentral.definitions;


public class ShippingAddressInfo {
    /// <summary>
    /// Name of a receiver
    /// </summary>
    public String customerName;

    /// <summary>
    /// Street address, line 1 - street address, P.O. box, company name, c/o
    /// </summary>
    public String street;

    /// <summary>
    /// Street address, line 2 - apartment, suite, unit, building, floor, etc.
    /// </summary>
    public String street2;

    /// <summary>
    /// City name
    /// </summary>
    public String city;

    /// <summary>
    /// State/province name
    /// </summary>
    public String state;

    /// <summary>
    /// Internal identifier of a state
    /// </summary>
    public String stateId;

    /// <summary>
    /// ISO code of a state
    /// </summary>
    public String stateIsoCode;

    /// <summary>
    /// Full name of a state
    /// </summary>
    public String stateName;

    /// <summary>
    /// Internal identifier of a country
    /// </summary>
    public String countryId;

    /// <summary>
    /// ISO code of a country
    /// </summary>
    public String countryIsoCode;

    /// <summary>
    /// Country name
    /// </summary>
    public String country;

    /// <summary>
    /// Full name of a country
    /// </summary>
    public String countryName;

    /// <summary>
    /// Zip code
    /// </summary>
    public String zip;
}