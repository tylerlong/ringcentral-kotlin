package com.ringcentral.definitions;


public class CallerInfoTo {
    /**
     *
     */
    public String phoneNumber;

    /**
     *
     */
    public String name;

    /**
     *
     */
    public String location;

    /**
     * Enum: Sent, SendingFailed, Queued
     */
    public String messageStatus;

    /**
     * Enum: Undefined, NoFaxSendPermission, NoInternationalPermission, NoFaxMachine, OutgoingCallError, RenderingFailed, TooManyPages, ReturnToDBQueue, NoCallTime, WrongNumber, ProhibitedNumber, InternalError, FaxSendingProhibited, ThePhoneIsBlacklisted, UserNotFound, ConvertError, DBGeneralError, SkypeBillingFailed, AccountSuspended, ProhibitedDestination, InternationalDisabled
     */
    public String faxErrorCode;
}
