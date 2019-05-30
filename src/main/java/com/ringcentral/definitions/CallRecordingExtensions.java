package com.ringcentral.definitions;


public class CallRecordingExtensions {
    /**
     * Link to call recording extension list resource
     */
    public String uri;

    /**
     *
     */
    public CallRecordingExtensionInfo[] records;

    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;

    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;
}
