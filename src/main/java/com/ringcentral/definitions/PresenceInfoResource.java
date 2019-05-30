package com.ringcentral.definitions;


public class PresenceInfoResource {
    /// <summary>
    /// Enum: Offline, Busy, Available
    /// </summary>
    public String userStatus;

    /// <summary>
    /// Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
    /// </summary>
    public String dndStatus;

    /// <summary>
    /// </summary>
    public String message;

    /// <summary>
    /// </summary>
    public Boolean allowSeeMyPresence;

    /// <summary>
    /// </summary>
    public Boolean ringOnMonitoredCall;

    /// <summary>
    /// </summary>
    public Boolean pickUpCallsOnHold;

    /// <summary>
    /// </summary>
    public ActiveCallInfo[] activeCalls;
}
