package com.ringcentral.definitions;


public class UserTemplates {
    /**
     * Link to user templates resource
     */
    public String uri;

    /**
     * List of user templates
     * Required
     */
    public TemplateInfo[] records;

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
