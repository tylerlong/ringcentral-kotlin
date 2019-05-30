package com.ringcentral.definitions;


public class EmergencyAddressInfoRequest {
    /**
     * Name of a customer
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
     * Zip code
     */
    public String zip;

    /**
     * State/province name
     */
    public String state;

    /**
     * Country name
     */
    public String country;
}
