package com.ringcentral.definitions;


public class CallRecordingExtensions {
    /// <summary>
    /// Link to call recording extension list resource
    /// </summary>
    public String uri;

    /// <summary>
    /// </summary>
    public CallRecordingExtensionInfo[] records;

    /// <summary>
    /// Information on navigation
    /// </summary>
    public CallHandlingNavigationInfo navigation;

    /// <summary>
    /// Information on paging
    /// </summary>
    public CallHandlingPagingInfo paging;
}
