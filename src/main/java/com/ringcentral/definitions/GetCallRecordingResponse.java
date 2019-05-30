package com.ringcentral.definitions;


public class GetCallRecordingResponse {
    /// <summary>
    /// Internal identifier of a call recording
    /// </summary>
    public String id;

    /// <summary>
    /// Link to a call recording binary content
    /// </summary>
    public String contentUri;

    /// <summary>
    /// Call recording file format. Supported format is audio/x-wav
    /// </summary>
    public String contentType;

    /// <summary>
    /// Recorded call duration
    /// </summary>
    public Long duration;
}
