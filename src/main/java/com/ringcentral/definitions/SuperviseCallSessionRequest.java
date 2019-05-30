package com.ringcentral.definitions;


public class SuperviseCallSessionRequest {
    /// <summary>
    /// Supervising mode
    /// Required
    /// Enum: Listen
    /// </summary>
    public String mode;

    /// <summary>
    /// Internal identifier of a supervisor's device
    /// Required
    /// </summary>
    public String deviceId;

    /// <summary>
    /// Extension number of a user that will be monitored
    /// Required
    /// </summary>
    public String extensionNumber;
}
