package com.ringcentral.definitions;


public class ActiveCallInfoWithoutSIP {
    /**
     * Internal identifier of a call
     */
    public String id;

    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;

    /**
     * Phone number or extension number of a caller. For GCM transport type '_from' property should be used
     */
    public String from;

    /**
     * Name of a caller
     */
    public String fromName;

    /**
     * Phone number or extension number of a callee
     */
    public String to;

    /**
     * Name of a callee
     */
    public String toName;

    /**
     * Time when the call is actually started
     */
    public String startTime;

    /**
     * Telephony call status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;

    /**
     * Internal identifier of a call session
     */
    public String sessionId;

    /**
     * Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'intermediate' it means the call is not actually ended, the connection is established on one of the devices
     * Enum: final, intermediate
     */
    public String terminationType;
}
