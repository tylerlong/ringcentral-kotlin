package com.ringcentral.definitions;


public class CompanyCallLogRecord {
    /**
     * Internal identifier of a cal log record
     */
    public String id;

    /**
     * Canonical URI of a call log record
     */
    public String uri;

    /**
     * Internal identifier of a call session
     */
    public String sessionId;

    /**
     * Caller information
     */
    public CallLogCallerInfo from;

    /**
     * Callee information
     */
    public CallLogCallerInfo to;

    /**
     * Call type
     * Enum: Voice, Fax
     */
    public String type;

    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;

    /**
     * Indicates whether the record is deleted. Returned for deleted records, for ISync requests
     */
    public Boolean deleted;

    /**
     * Action description of the call operation
     * Enum: Unknown, Phone Call, Phone Login, Incoming Fax, Accept Call, FindMe, FollowMe, Outgoing Fax, Call Return, Calling Card, Ring Directly, RingOut Web, VoIP Call, RingOut PC, RingMe, Transfer, 411 Info, Emergency, E911 Update, Support, RingOut Mobile
     */
    public String action;

    /**
     * Status description of the call operation
     * Enum: Unknown, ResultInProgress, Missed, Call accepted, Voicemail, Rejected, Reply, Received, Receive Error, Fax on Demand, Partial Receive, Blocked, Call connected, No Answer, International Disabled, Busy, Send Error, Sent, No fax machine, ResultEmpty, Account, Suspended, Call Failed, Call Failure, Internal Error, IP Phone offline, Restricted Number, Wrong Number, Stopped, Hang up, Poor Line Quality, Partially Sent, International Restriction, Abandoned, Declined, Fax Receipt Error, Fax Send Error
     */
    public String result;

    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String startTime;

    /**
     * Call duration in seconds
     */
    public Long duration;

    /**
     * Call recording data. Returned if a call is recorded
     */
    public CallLogRecordingInfo recording;
}
