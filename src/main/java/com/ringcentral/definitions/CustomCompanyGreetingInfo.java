package com.ringcentral.definitions;


public class CustomCompanyGreetingInfo {
    /// <summary>
    /// Link to an extension custom greeting
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of an answering rule
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a company greeting
    /// Enum: Company, StartRecording, StopRecording, AutomaticRecording
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

    /// <summary>
    /// Information on a greeting language. Supported for types 'StopRecording', 'StartRecording', 'AutomaticRecording'
    /// </summary>
    public CustomCompanyGreetingLanguageInfo language;
}
