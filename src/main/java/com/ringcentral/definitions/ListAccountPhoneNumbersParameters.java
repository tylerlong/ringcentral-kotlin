package com.ringcentral.definitions;


public class ListAccountPhoneNumbersParameters {
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
    /// Usage type of a phone number
    /// </summary>
    public String[] usageType;
}
