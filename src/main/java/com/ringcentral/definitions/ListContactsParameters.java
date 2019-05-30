package com.ringcentral.definitions;


public class ListContactsParameters {
    /// <summary>
    /// If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
    /// </summary>
    public String startsWith;

    /// <summary>
    /// Sorts results by the specified property
    /// </summary>
    public String[] sortBy;

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
    /// </summary>
    public String[] phoneNumber;
}
