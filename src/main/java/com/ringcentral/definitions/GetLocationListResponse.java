package com.ringcentral.definitions;


public class GetLocationListResponse {
    /**
     * List of locations
     */
    public LocationInfo[] records;

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
