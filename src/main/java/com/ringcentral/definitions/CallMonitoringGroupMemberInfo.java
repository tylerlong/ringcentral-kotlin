package com.ringcentral.definitions;


public class CallMonitoringGroupMemberInfo {
    /**
     * Link to a call monitoring group member
     */
    public String uri;

    /**
     * Internal identifier of a call monitoring group member
     */
    public String id;

    /**
     * Extension number of a call monitoring group member
     */
    public String extensionNumber;

    /**
     * Call monitoring permission; mltiple values allowed: * "Monitoring" - User can monitor a group * "Monitored" - User can be monitored
     * Enum: Monitoring, Monitored
     */
    public String permissions;
}
