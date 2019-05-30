package com.ringcentral.definitions;


public class CallMonitoringGroups {
    /**
     * Link to a call monitoring groups resource
     * Required
     */
    public String uri;

    /**
     * List of call monitoring group members
     * Required
     */
    public CallMonitoringGroup[] records;

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
