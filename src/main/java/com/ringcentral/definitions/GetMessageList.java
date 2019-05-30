package com.ringcentral.definitions;


public class GetMessageList {
    /**
     * List of records with message information
     * Required
     */
    public GetMessageInfoResponse[] records;

    /**
     * Information on navigation
     * Required
     */
    public MessagingNavigationInfo navigation;

    /**
     * Information on paging
     * Required
     */
    public MessagingPagingInfo paging;
}
