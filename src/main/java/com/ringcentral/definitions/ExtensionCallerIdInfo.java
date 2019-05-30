package com.ringcentral.definitions;


public class ExtensionCallerIdInfo {
    /**
     * Canonical URL of a caller ID resource
     */
    public String uri;

    /**
     *
     */
    public CallerIdByDevice[] byDevice;

    /**
     *
     */
    public CallerIdByFeature[] byFeature;

    /**
     * If 'True', then user first name and last name will be used as caller ID when making outbound calls from extension
     */
    public Boolean extensionNameForOutboundCalls;

    /**
     * If 'True', then extension number will be used as caller ID when making internal calls
     */
    public Boolean extensionNumberForInternalCalls;
}
