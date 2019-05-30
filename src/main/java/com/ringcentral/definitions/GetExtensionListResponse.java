package com.ringcentral.definitions;


public class GetExtensionListResponse {
    /**
     * List of extensions with extension information
     * Required
     */
    public GetExtensionInfoResponse[] records;

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
