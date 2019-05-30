package com.ringcentral.definitions;


public class ListCallQueuesParameters {
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
     * Internal identifier of an extension that is a member of every group within the result
     */
    public String memberExtensionId;
}
