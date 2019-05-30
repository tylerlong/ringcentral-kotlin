package com.ringcentral.definitions;


public class ActiveCallInfo {
    /// <summary>
    /// </summary>
    public String id;

    /// <summary>
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Phone number or extension number of a caller. For GCM transport type '_from' property should be used
    /// </summary>
    public String from;

    /// <summary>
    /// Name of a caller
    /// </summary>
    public String fromName;

    /// <summary>
    /// Phone number or extension number of a callee
    /// </summary>
    public String to;

    /// <summary>
    /// Name of a callee
    /// </summary>
    public String toName;

    /// <summary>
    /// Time when the call is actually started
    /// </summary>
    public String startTime;

    /// <summary>
    /// </summary>
    public String telephonyStatus;

    /// <summary>
    /// </summary>
    public DetailedCallInfo sipData;

    /// <summary>
    /// </summary>
    public String sessionId;

    /// <summary>
    /// </summary>
    public String terminationType;
}
