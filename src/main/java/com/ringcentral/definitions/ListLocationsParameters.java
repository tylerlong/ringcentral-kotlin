package com.ringcentral.definitions;


public class ListLocationsParameters {
    /**
     * Sorts results by the property specified
     * Default: City
     * Enum: Npa, City
     */
    public String orderBy;

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
     * Internal identifier of a state
     */
    public String stateId;

    /**
     * Specifies if nxx codes are returned
     */
    public Boolean withNxx;
}
