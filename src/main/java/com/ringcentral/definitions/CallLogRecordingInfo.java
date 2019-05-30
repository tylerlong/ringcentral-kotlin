package com.ringcentral.definitions;


public class CallLogRecordingInfo {
    /**
     * Internal identifier of the call recording
     */
    public String id;

    /**
     * Link to the call recording metadata resource
     */
    public String uri;

    /**
     * Indicates recording mode used
     * Enum: Automatic, OnDemand
     */
    public String type;

    /**
     * Link to the call recording binary content
     */
    public String contentUri;
}
