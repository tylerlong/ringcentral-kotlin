package com.ringcentral.definitions;


public class ActiveCallsResponse {
    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;

    /**
     * Information on navigation
     * Required
     */
    public CallLogNavigationInfo navigation;

    /**
     * Information on paging
     * Required
     */
    public CallLogPagingInfo paging;
}
