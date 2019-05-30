package com.ringcentral.definitions;


public class SearchRequest {
    /**
     * page size
     */
    public Long count;

    /**
     * only support 'userName' or 'email' filter expressions for now
     */
    public String filter;

    /**
     *
     */
    public String[] schemas;

    /**
     * start index (1-based)
     */
    public Long startIndex;
}
