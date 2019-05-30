package com.ringcentral.definitions;


public class CallMonitoringGroupMemberInfo {
    /// <summary>
    /// Link to a call monitoring group member
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a call monitoring group member
    /// </summary>
    public String id;

    /// <summary>
    /// Extension number of a call monitoring group member
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// Call monitoring permission; mltiple values allowed: * "Monitoring" - User can monitor a group * "Monitored" - User can be monitored
    /// Enum: Monitoring, Monitored
    /// </summary>
    public String permissions;
}
