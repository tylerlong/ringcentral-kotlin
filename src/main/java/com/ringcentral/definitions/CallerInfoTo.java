package com.ringcentral.definitions;


public class CallerInfoTo {
    /// <summary>
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// </summary>
    public String name;

    /// <summary>
    /// </summary>
    public String location;

    /// <summary>
    /// Enum: Sent, SendingFailed, Queued
    /// </summary>
    public String messageStatus;

    /// <summary>
    /// Enum: Undefined, NoFaxSendPermission, NoInternationalPermission, NoFaxMachine, OutgoingCallError, RenderingFailed, TooManyPages, ReturnToDBQueue, NoCallTime, WrongNumber, ProhibitedNumber, InternalError, FaxSendingProhibited, ThePhoneIsBlacklisted, UserNotFound, ConvertError, DBGeneralError, SkypeBillingFailed, AccountSuspended, ProhibitedDestination, InternationalDisabled
    /// </summary>
    public String faxErrorCode;
}
