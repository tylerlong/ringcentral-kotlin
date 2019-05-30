package com.ringcentral.definitions;


public class CompanyAnsweringRuleList {
    /// <summary>
    /// Link to an answering rule resource
    /// </summary>
    public String uri;

    /// <summary>
    /// List of company answering rules
    /// </summary>
    public ListCompanyAnsweringRuleInfo[] records;

    /// <summary>
    /// Information on paging
    /// </summary>
    public CallHandlingPagingInfo paging;

    /// <summary>
    /// Information on navigation
    /// </summary>
    public CallHandlingNavigationInfo navigation;
}
