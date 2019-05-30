package com.ringcentral.definitions;


public class CallQueueMembers {
    /// <summary>
    /// Link to a call queue members resource
    /// Required
    /// </summary>
    public String uri;

    /// <summary>
    /// List of call queue members
    /// Required
    /// </summary>
    public CallQueueMemberInfo[] records;

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
