package com.ringcentral.definitions;


public class ListContactsParameters {
    /**
     * If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
     */
    public String startsWith;

    /**
     * Sorts results by the specified property
     */
    public String[] sortBy;

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
     *
     */
    public String[] phoneNumber;
}
