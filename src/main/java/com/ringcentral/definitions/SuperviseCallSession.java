package com.ringcentral.definitions;


public class SuperviseCallSession {
    /**
     * Information about a call party that monitors a call
     */
    public PartyInfo from;

    /**
     * Information about a call party that is monitored
     */
    public PartyInfo to;

    /**
     * Direction of a call
     * Enum: Outbound, Inbound
     */
    public String direction;

    /**
     * Internal identifier of a party that monitors a call
     */
    public String id;

    /**
     * Specifies if a call party is muted
     */
    public Boolean muted;

    /**
     *
     */
    public OwnerInfo owner;

    /**
     * Specifies if a device is stand-alone
     */
    public Boolean standAlone;

    /**
     *
     */
    public CallStatusInfo status;
}
