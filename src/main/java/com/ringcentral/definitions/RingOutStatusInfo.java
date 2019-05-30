package com.ringcentral.definitions;


public class RingOutStatusInfo {
    /**
     * Status of a call
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String callStatus;

    /**
     * Status of a calling party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String callerStatus;

    /**
     * Status of a called party
     * Enum: Invalid, Success, InProgress, Busy, NoAnswer, Rejected, GenericError, Finished, InternationalDisabled, DestinationBlocked, NotEnoughFunds, NoSuchUser
     */
    public String calleeStatus;
}
