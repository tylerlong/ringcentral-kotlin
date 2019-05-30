package com.ringcentral.definitions;


public class AccountPresenceEventBody {
    /// <summary>
    /// Internal identifier of an extension. Optional parameter
    /// Default: ~
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Telephony presence status. Returned if telephony status is changed.
    /// Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
    /// </summary>
    public String telephonyStatus;

    /// <summary>
    /// Order number of a notification to state the chronology
    /// </summary>
    public Long sequence;

    /// <summary>
    /// Aggregated presence status, calculated from a number of sources
    /// Enum: Offline, Busy, Available
    /// </summary>
    public String presenceStatus;

    /// <summary>
    /// User-defined presence status (as previously published by the user)
    /// Enum: Offline, Busy, Available
    /// </summary>
    public String userStatus;

    /// <summary>
    /// Extended DnD (Do not Disturb) status
    /// Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
    /// </summary>
    public String dndStatus;

    /// <summary>
    /// If 'True' enables other extensions to see the extension presence status
    /// </summary>
    public Boolean allowSeeMyPresence;

    /// <summary>
    /// If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    /// </summary>
    public Boolean ringOnMonitoredCall;

    /// <summary>
    /// If 'True' enables the extension user to pick up a monitored line on hold
    /// </summary>
    public Boolean pickUpCallsOnHold;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
