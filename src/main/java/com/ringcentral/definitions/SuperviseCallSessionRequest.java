package com.ringcentral.definitions;


public class SuperviseCallSessionRequest {
    /**
     * Supervising mode
     * Required
     * Enum: Listen
     */
    public String mode;

    /**
     * Internal identifier of a supervisor's device
     * Required
     */
    public String deviceId;

    /**
     * Extension number of a user that will be monitored
     * Required
     */
    public String extensionNumber;
}
