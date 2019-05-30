package com.ringcentral.definitions;


public class IncomingCallEvent {
    /// <summary>
    /// Apple Push Notification Service Info
    /// </summary>
    public APSInfo aps;

    /// <summary>
    /// Event filter URI
    /// </summary>
    public String event;

    /// <summary>
    /// Universally unique identifier of a notification
    /// </summary>
    public String uuid;

    /// <summary>
    /// Internal identifier of a subscription
    /// </summary>
    public String subscriptionId;

    /// <summary>
    /// The datetime of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String timestamp;

    /// <summary>
    /// Internal identifier of an extension
    /// Default: ~
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Calling action, for example 'StartRing'
    /// </summary>
    public String action;

    /// <summary>
    /// Identifier of a call session
    /// </summary>
    public String sessionId;

    /// <summary>
    /// Identifier of a server
    /// </summary>
    public String serverId;

    /// <summary>
    /// Phone number of a caller. For GCM transport type '_from' property should be used
    /// </summary>
    public String from;

    /// <summary>
    /// Caller name
    /// </summary>
    public String fromName;

    /// <summary>
    /// Phone number of a callee
    /// </summary>
    public String to;

    /// <summary>
    /// Callee name
    /// </summary>
    public String toName;

    /// <summary>
    /// Unique identifier of a session
    /// </summary>
    public String sid;

    /// <summary>
    /// SIP proxy registration name
    /// </summary>
    public String toUrl;

    /// <summary>
    /// User data
    /// </summary>
    public String srvLvl;

    /// <summary>
    /// User data
    /// </summary>
    public String srvLvlExt;

    /// <summary>
    /// File containing recorded caller name
    /// </summary>
    public String recUrl;

    /// <summary>
    /// Notification lifetime value in seconds, the default value is 30 seconds
    /// </summary>
    public Long pn_ttl;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
