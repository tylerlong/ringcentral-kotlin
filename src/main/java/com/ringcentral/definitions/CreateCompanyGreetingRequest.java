package com.ringcentral.definitions;


public class CreateCompanyGreetingRequest {
    /**
     * Type of a greeting, specifying the case when the greeting is played.
     * Enum: Company, StartRecording, StopRecording, AutomaticRecording
     */
    public String type;

    /**
     * Meida file to upload
     */
    public Attachment binary;

    /**
     *
     */
    public CustomCompanyGreetingAnsweringRuleInfo answeringRule;
}
