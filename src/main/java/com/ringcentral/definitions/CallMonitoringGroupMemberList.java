package com.ringcentral.definitions;


public class CallMonitoringGroupMemberList {
    /**
     * Link to a call monitoring group members resource
     * Required
     */
    public String uri;

    /**
     * List of a call monitoring group members
     * Required
     */
    public CallMonitoringGroupMemberInfo[] records;

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
