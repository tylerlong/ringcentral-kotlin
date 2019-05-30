package com.ringcentral.definitions;


public class ActiveCallInfoWithoutSIP {
    /// <summary>
    /// Internal identifier of a call
    /// </summary>
    public String id;

    /// <summary>
    /// Call direction
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
    /// Telephony call status
    /// Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
    /// </summary>
    public String telephonyStatus;

    /// <summary>
    /// Internal identifier of a call session
    /// </summary>
    public String sessionId;

    /// <summary>
    /// Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'intermediate' it means the call is not actually ended, the connection is established on one of the devices
    /// Enum: final, intermediate
    /// </summary>
    public String terminationType;
}
