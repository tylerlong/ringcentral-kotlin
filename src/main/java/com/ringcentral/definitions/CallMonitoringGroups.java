package com.ringcentral.definitions;


public class CallMonitoringGroups {
    /// <summary>
    /// Link to a call monitoring groups resource
    /// Required
    /// </summary>
    public String uri;

    /// <summary>
    /// List of call monitoring group members
    /// Required
    /// </summary>
    public CallMonitoringGroup[] records;

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
