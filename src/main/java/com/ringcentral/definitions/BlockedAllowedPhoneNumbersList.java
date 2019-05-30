package com.ringcentral.definitions;


// List of blocked or allowed phone numbers
public class BlockedAllowedPhoneNumbersList {
    /// <summary>
    /// Link to a list of blocked/allowed phone numbers resource
    /// </summary>
    public String uri;

    /// <summary>
    /// </summary>
    public BlockedAllowedPhoneNumberInfo[] records;

    /// <summary>
    /// Information on navigation
    /// </summary>
    public CallHandlingNavigationInfo navigation;

    /// <summary>
    /// Information on paging
    /// </summary>
    public CallHandlingPagingInfo paging;
}
