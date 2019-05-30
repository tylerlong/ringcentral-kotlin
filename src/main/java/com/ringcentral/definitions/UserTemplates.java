package com.ringcentral.definitions;


public class UserTemplates {
    /// <summary>
    /// Link to user templates resource
    /// </summary>
    public String uri;

    /// <summary>
    /// List of user templates
    /// Required
    /// </summary>
    public TemplateInfo[] records;

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
