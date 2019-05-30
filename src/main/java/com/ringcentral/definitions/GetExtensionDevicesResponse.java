package com.ringcentral.definitions;


public class GetExtensionDevicesResponse {
    /**
     * List of extension devices
     * Required
     */
    public GetDeviceInfoResponse[] records;

    /**
     * Information on navigation
     * Required
     */
    public DeviceProvisioningNavigationInfo navigation;

    /**
     * Information on paging
     * Required
     */
    public DeviceProvisioningPagingInfo paging;
}
