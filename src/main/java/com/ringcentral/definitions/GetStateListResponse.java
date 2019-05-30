package com.ringcentral.definitions;


public class GetStateListResponse {
    /**
     * List of states
     * Required
     */
    public GetStateInfoResponse[] records;

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
