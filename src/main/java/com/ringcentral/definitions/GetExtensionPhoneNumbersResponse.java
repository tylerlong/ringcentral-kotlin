package com.ringcentral.definitions;


public class GetExtensionPhoneNumbersResponse {
    /**
     * List of phone numbers
     * Required
     */
    public UserPhoneNumberInfo[] records;

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
