package com.ringcentral.definitions;


public class ListLocationsParameters {
    /// <summary>
    /// Sorts results by the property specified
    /// Default: City
    /// Enum: Npa, City
    /// </summary>
    public String orderBy;

    /// <summary>
    /// Indicates the page number to retrieve. Only positive number values are accepted
    /// Default: 1
    /// </summary>
    public Long page;

    /// <summary>
    /// Indicates the page size (number of items)
    /// Default: 100
    /// </summary>
    public Long perPage;

    /// <summary>
    /// Internal identifier of a state
    /// </summary>
    public String stateId;

    /// <summary>
    /// Specifies if nxx codes are returned
    /// </summary>
    public Boolean withNxx;
}
