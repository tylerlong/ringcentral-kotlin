package com.ringcentral.definitions;


public class CustomUserGreetingInfo {
    /// <summary>
    /// Link to a custom user greeting
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a custom user greeting
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a custom user greeting
    /// Enum: Introductory, Announcement, ConnectingAudio, ConnectingMessage, Voicemail, Unavailable, HoldMusic
    /// </summary>
    public String type;

    /// <summary>
    /// Content media type in WAV/MP3 format
    /// Enum: WAV, MP3
    /// </summary>
    public String contentType;

    /// <summary>
    /// Link to a greeting content (audio file)
    /// </summary>
    public String contentUri;

    /// <summary>
    /// Information on an answering rule that the greeting is applied to
    /// </summary>
    public CustomGreetingAnsweringRuleInfo answeringRule;
}
