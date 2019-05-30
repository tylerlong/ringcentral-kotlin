package com.ringcentral.definitions;


public class ListCountriesParameters {
    /**
     * Specifies whether login with the phone numbers of this country is enabled or not
     */
    public Boolean loginAllowed;

    /**
     * Indicates whether signup/billing is allowed for a country. If not specified all countries are returned (according to other filters specified if any)
     */
    public Boolean signupAllowed;

    /**
     * Specifies if RingCentral sells phone numbers of this country
     */
    public Boolean numberSelling;

    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;

    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;

    /**
     * Specifies if free phone line for softphone is available for a country or not
     */
    public Boolean freeSoftphoneLine;
}
