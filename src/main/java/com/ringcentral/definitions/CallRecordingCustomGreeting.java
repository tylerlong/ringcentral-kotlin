package com.ringcentral.definitions;


public class CallRecordingCustomGreeting {
    /// <summary>
    /// Enum: StartRecording, StopRecording, AutomaticRecording
    /// </summary>
    public String type;

    /// <summary>
    /// Custom greeting data
    /// </summary>
    public CallRecordingCustomGreetingData custom;

    /// <summary>
    /// Custom greeting language
    /// </summary>
    public CallRecordingCustomGreetingLanguage language;
}
