package com.ringcentral.definitions;


public class ActiveCallInfo {
    /**
     *
     */
    public String id;

    /**
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
     *
     */
    public String telephonyStatus;

    /**
     *
     */
    public DetailedCallInfo sipData;

    /**
     *
     */
    public String sessionId;

    /**
     *
     */
    public String terminationType;
}
