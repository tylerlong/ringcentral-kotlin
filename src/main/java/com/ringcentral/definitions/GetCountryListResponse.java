package com.ringcentral.definitions;


public class GetCountryListResponse {
    /**
     * List of countries with the country data
     * Required
     */
    public GetCountryInfoDictionaryResponse[] records;

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
