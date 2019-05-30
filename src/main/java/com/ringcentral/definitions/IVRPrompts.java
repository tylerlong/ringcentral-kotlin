package com.ringcentral.definitions;


public class IVRPrompts {
    /**
     * Link to prompts library resource
     */
    public String uri;

    /**
     * List of Prompts
     */
    public PromptInfo[] records;

    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;

    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;
}
