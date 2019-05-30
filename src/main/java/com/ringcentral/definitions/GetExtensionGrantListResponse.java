package com.ringcentral.definitions;


public class GetExtensionGrantListResponse {
    /**
     * List of extension grants with details
     * Required
     */
    public GrantInfo[] records;

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
