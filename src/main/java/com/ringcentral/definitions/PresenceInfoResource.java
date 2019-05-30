package com.ringcentral.definitions;


public class PresenceInfoResource {
    /**
     * Enum: Offline, Busy, Available
     */
    public String userStatus;

    /**
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;

    /**
     *
     */
    public String message;

    /**
     *
     */
    public Boolean allowSeeMyPresence;

    /**
     *
     */
    public Boolean ringOnMonitoredCall;

    /**
     *
     */
    public Boolean pickUpCallsOnHold;

    /**
     *
     */
    public ActiveCallInfo[] activeCalls;
}
