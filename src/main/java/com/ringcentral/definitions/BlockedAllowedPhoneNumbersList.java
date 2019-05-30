package com.ringcentral.definitions;


// List of blocked or allowed phone numbers
public class BlockedAllowedPhoneNumbersList {
    /**
     * Link to a list of blocked/allowed phone numbers resource
     */
    public String uri;

    /**
     *
     */
    public BlockedAllowedPhoneNumberInfo[] records;

    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;

    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;
}
