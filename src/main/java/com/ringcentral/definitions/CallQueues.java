package com.ringcentral.definitions;


public class CallQueues {
    /// <summary>
    /// Link to a call queues resource
    /// Required
    /// </summary>
    public String uri;

    /// <summary>
    /// List of call queues
    /// Required
    /// </summary>
    public CallQueueInfo[] records;

    /// <summary>
    /// Information on navigation
    /// Required
    /// </summary>
    public ProvisioningNavigationInfo navigation;

    /// <summary>
    /// Information on paging
    /// Required
    /// </summary>
    public ProvisioningPagingInfo paging;
}
