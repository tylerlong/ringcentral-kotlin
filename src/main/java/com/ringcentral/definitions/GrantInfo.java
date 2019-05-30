package com.ringcentral.definitions;


public class GrantInfo {
    /**
     * Canonical URI of a grant
     */
    public String uri;

    /**
     * Extension information
     */
    public ExtensionInfoGrants extension;

    /**
     * Specifies if picking up of other extensions' calls is allowed for the extension. If 'Presence' feature is disabled for the given extension, the flag is not returned
     */
    public Boolean callPickup;

    /**
     * Specifies if monitoring of other extensions' calls is allowed for the extension. If 'CallMonitoring' feature is disabled for the given extension, the flag is not returned
     */
    public Boolean callMonitoring;

    /**
     * Specifies whether the current extension is able to make or receive calls on behalf of the user referenced in extension object
     */
    public Boolean callOnBehalfOf;

    /**
     * Specifies whether the current extension can delegate a call to the user referenced in extension object
     */
    public Boolean callDelegation;

    /**
     * Specifies whether the current extension is allowed to call Paging Only group referenced to in extension object
     */
    public Boolean groupPaging;
}
