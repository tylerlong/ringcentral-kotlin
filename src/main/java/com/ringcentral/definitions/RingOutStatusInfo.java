package com.ringcentral.definitions;


public class RingOutStatusInfo {
    /// <summary>
    /// Status of a call
    /// Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
    /// </summary>
    public String callStatus;

    /// <summary>
    /// Status of a calling party
    /// Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
    /// </summary>
    public String callerStatus;

    /// <summary>
    /// Status of a called party
    /// Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
    /// </summary>
    public String calleeStatus;
}
