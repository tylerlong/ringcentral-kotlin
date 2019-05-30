package com.ringcentral.definitions;


public class ShippingAddressInfo {
    /**
     * Name of a receiver
     */
    public String customerName;

    /**
     * Street address, line 1 - street address, P.O. box, company name, c/o
     */
    public String street;

    /**
     * Street address, line 2 - apartment, suite, unit, building, floor, etc.
     */
    public String street2;

    /**
     * City name
     */
    public String city;

    /**
     * State/province name
     */
    public String state;

    /**
     * Internal identifier of a state
     */
    public String stateId;

    /**
     * ISO code of a state
     */
    public String stateIsoCode;

    /**
     * Full name of a state
     */
    public String stateName;

    /**
     * Internal identifier of a country
     */
    public String countryId;

    /**
     * ISO code of a country
     */
    public String countryIsoCode;

    /**
     * Country name
     */
    public String country;

    /**
     * Full name of a country
     */
    public String countryName;

    /**
     * Zip code
     */
    public String zip;
}
