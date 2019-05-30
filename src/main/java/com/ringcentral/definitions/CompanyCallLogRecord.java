package com.ringcentral.definitions;


public class CompanyCallLogRecord {
    /// <summary>
    /// Internal identifier of a cal log record
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a call log record
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a call session
    /// </summary>
    public String sessionId;

    /// <summary>
    /// Caller information
    /// </summary>
    public CallLogCallerInfo from;

    /// <summary>
    /// Callee information
    /// </summary>
    public CallLogCallerInfo to;

    /// <summary>
    /// Call type
    /// Enum: Voice, Fax
    /// </summary>
    public String type;

    /// <summary>
    /// Call direction
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Indicates whether the record is deleted. Returned for deleted records, for ISync requests
    /// </summary>
    public Boolean deleted;

    /// <summary>
    /// Action description of the call operation
    /// Enum: Unknown, Phone Call, Phone Login, Incoming Fax, Accept Call, FindMe, FollowMe, Outgoing Fax, Call Return, Calling Card, Ring Directly, RingOut Web, VoIP Call, RingOut PC, RingMe, Transfer, 411 Info, Emergency, E911 Update, Support, RingOut Mobile
    /// </summary>
    public String action;

    /// <summary>
    /// Status description of the call operation
    /// Enum: Unknown, ResultInProgress, Missed, Call accepted, Voicemail, Rejected, Reply, Received, Receive Error, Fax on Demand, Partial Receive, Blocked, Call connected, No Answer, International Disabled, Busy, Send Error, Sent, No fax machine, ResultEmpty, Account, Suspended, Call Failed, Call Failure, Internal Error, IP Phone offline, Restricted Number, Wrong Number, Stopped, Hang up, Poor Line Quality, Partially Sent, International Restriction, Abandoned, Declined, Fax Receipt Error, Fax Send Error
    /// </summary>
    public String result;

    /// <summary>
    /// The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String startTime;

    /// <summary>
    /// Call duration in seconds
    /// </summary>
    public Long duration;

    /// <summary>
    /// Call recording data. Returned if a call is recorded
    /// </summary>
    public CallLogRecordingInfo recording;
}
