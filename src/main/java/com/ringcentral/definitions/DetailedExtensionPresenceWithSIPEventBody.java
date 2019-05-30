package com.ringcentral.definitions;


public class DetailedExtensionPresenceWithSIPEventBody {
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;

    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;

    /**
     * List of the latest 10 active calls on extension
     */
    public ActiveCallInfo[] activeCalls;

    /**
     * Order number of a notification to state the chronology
     */
    public Long sequence;

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;

    /**
     * Extended DnD (Do not Disturb) status
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;

    /**
     * If 'True' enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;

    /**
     * If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;

    /**
     * If 'True' enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;

    /**
     * Total number of active calls on extension at the present moment
     */
    public Long totalActiveCalls;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
