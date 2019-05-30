package com.ringcentral.definitions;


public class CallLogRecordingInfo {
    /// <summary>
    /// Internal identifier of the call recording
    /// </summary>
    public String id;

    /// <summary>
    /// Link to the call recording metadata resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Indicates recording mode used
    /// Enum: Automatic, OnDemand
    /// </summary>
    public String type;

    /// <summary>
    /// Link to the call recording binary content
    /// </summary>
    public String contentUri;
}
