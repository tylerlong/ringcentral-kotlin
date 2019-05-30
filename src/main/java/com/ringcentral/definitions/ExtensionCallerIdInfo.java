package com.ringcentral.definitions;


public class ExtensionCallerIdInfo {
    /// <summary>
    /// Canonical URL of a caller ID resource
    /// </summary>
    public String uri;

    /// <summary>
    /// </summary>
    public CallerIdByDevice[] byDevice;

    /// <summary>
    /// </summary>
    public CallerIdByFeature[] byFeature;

    /// <summary>
    /// If 'True', then user first name and last name will be used as caller ID when making outbound calls from extension
    /// </summary>
    public Boolean extensionNameForOutboundCalls;

    /// <summary>
    /// If 'True', then extension number will be used as caller ID when making internal calls
    /// </summary>
    public Boolean extensionNumberForInternalCalls;
}
