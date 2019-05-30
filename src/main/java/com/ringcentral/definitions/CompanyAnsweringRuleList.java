package com.ringcentral.definitions;


public class CompanyAnsweringRuleList {
    /**
     * Link to an answering rule resource
     */
    public String uri;

    /**
     * List of company answering rules
     */
    public ListCompanyAnsweringRuleInfo[] records;

    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
}
