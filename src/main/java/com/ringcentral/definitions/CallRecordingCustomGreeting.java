package com.ringcentral.definitions;


public class CallRecordingCustomGreeting {
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;

    /**
     * Custom greeting data
     */
    public CallRecordingCustomGreetingData custom;

    /**
     * Custom greeting language
     */
    public CallRecordingCustomGreetingLanguage language;
}
