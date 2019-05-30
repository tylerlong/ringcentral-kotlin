package com.ringcentral.definitions;


public class CallQueues {
    /**
     * Link to a call queues resource
     * Required
     */
    public String uri;

    /**
     * List of call queues
     * Required
     */
    public CallQueueInfo[] records;

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
