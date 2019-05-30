package com.ringcentral.definitions;


public class GrantInfo {
    /// <summary>
    /// Canonical URI of a grant
    /// </summary>
    public String uri;

    /// <summary>
    /// Extension information
    /// </summary>
    public ExtensionInfoGrants extension;

    /// <summary>
    /// Specifies if picking up of other extensions' calls is allowed for the extension. If 'Presence' feature is disabled for the given extension, the flag is not returned
    /// </summary>
    public Boolean callPickup;

    /// <summary>
    /// Specifies if monitoring of other extensions' calls is allowed for the extension. If 'CallMonitoring' feature is disabled for the given extension, the flag is not returned
    /// </summary>
    public Boolean callMonitoring;

    /// <summary>
    /// Specifies whether the current extension is able to make or receive calls on behalf of the user referenced in extension object
    /// </summary>
    public Boolean callOnBehalfOf;

    /// <summary>
    /// Specifies whether the current extension can delegate a call to the user referenced in extension object
    /// </summary>
    public Boolean callDelegation;

    /// <summary>
    /// Specifies whether the current extension is allowed to call Paging Only group referenced to in extension object
    /// </summary>
    public Boolean groupPaging;
}
