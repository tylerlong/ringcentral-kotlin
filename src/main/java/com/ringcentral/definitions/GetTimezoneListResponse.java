package com.ringcentral.definitions;


public class GetTimezoneListResponse {
    /**
     * List of timezones
     * Required
     */
    public GetTimezoneInfoResponse[] records;

    /**
     * Information on navigation
     * Required
     */
    public ProvisioningNavigationInfo navigation;

    /**
     * Information on paging
     * Required
     */
    public ProvisioningPagingInfo paging;
}
