package com.ringcentral.definitions;


public class GreetingResource {
    /// <summary>
    /// Enum: StartRecording, StopRecording, AutomaticRecording
    /// </summary>
    public String type;

    /// <summary>
    /// 'Default' value specifies that all greetings of that type (in all languages) are default, if at least one greeting (in any language) of the specified type is custom, then 'Custom' value is returned.
    /// Enum: Default, Custom
    /// </summary>
    public String mode;
}
