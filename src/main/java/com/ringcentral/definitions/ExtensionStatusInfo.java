package com.ringcentral.definitions;


public class ExtensionStatusInfo {
    /// <summary>
    /// A free-form user comment, describing the status change reason
    /// </summary>
    public String comment;

    /// <summary>
    /// Type of suspension
    /// Enum: Voluntarily, Involuntarily
    /// </summary>
    public String reason;
}
