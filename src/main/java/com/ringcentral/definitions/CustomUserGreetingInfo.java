package com.ringcentral.definitions;


public class CustomUserGreetingInfo {
    /**
     * Link to a custom user greeting
     */
    public String uri;

    /**
     * Internal identifier of a custom user greeting
     */
    public String id;

    /**
     * Type of a custom user greeting
     * Enum: Introductory, Announcement, ConnectingAudio, ConnectingMessage, Voicemail, Unavailable, HoldMusic
     */
    public String type;

    /**
     * Content media type in WAV/MP3 format
     * Enum: WAV, MP3
     */
    public String contentType;

    /**
     * Link to a greeting content (audio file)
     */
    public String contentUri;

    /**
     * Information on an answering rule that the greeting is applied to
     */
    public CustomGreetingAnsweringRuleInfo answeringRule;
}
