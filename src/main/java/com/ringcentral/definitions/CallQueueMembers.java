package com.ringcentral.definitions;


public class CallQueueMembers {
    /**
     * Link to a call queue members resource
     * Required
     */
    public String uri;

    /**
     * List of call queue members
     * Required
     */
    public CallQueueMemberInfo[] records;

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
