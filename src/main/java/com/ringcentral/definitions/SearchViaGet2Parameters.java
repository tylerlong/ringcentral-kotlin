package com.ringcentral.definitions;


public class SearchViaGet2Parameters {
    /**
     * only support 'userName' or 'email' filter expressions for now
     */
    public String filter;

    /**
     * start index (1-based)
     * Default: 1
     */
    public Long startIndex;

    /**
     * page size
     * Default: 100
     */
    public Long count;
}
