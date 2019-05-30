package com.ringcentral.definitions;


public class AccountPresenceInfo {
    /**
     * Canonical URI of account presence resource
     */
    public String uri;

    /**
     * List of Prompts
     */
    public GetPresenceInfo[] records;

    /**
     * Information on navigation
     */
    public PresenceNavigationInfo navigation;

    /**
     * Information on paging
     */
    public PresencePagingInfo paging;
}
