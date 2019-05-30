package com.ringcentral.definitions;


public class EmergencyAddressInfoRequest {
    /// <summary>
    /// Name of a customer
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
    /// Zip code
    /// </summary>
    public String zip;

    /// <summary>
    /// State/province name
    /// </summary>
    public String state;

    /// <summary>
    /// Country name
    /// </summary>
    public String country;
}
