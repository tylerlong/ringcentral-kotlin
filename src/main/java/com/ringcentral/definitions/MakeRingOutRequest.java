package com.ringcentral.definitions;


public class MakeRingOutRequest {
    /**
     * Phone number of the caller. This number corresponds to the 1st leg of the RingOut call. This number can be one of user's configured forwarding numbers or arbitrary number
     * Required
     */
    public MakeRingOutCallerInfoRequestFrom from;

    /**
     * Phone number of the called party. This number corresponds to the 2nd leg of a RingOut call
     * Required
     */
    public MakeRingOutCallerInfoRequestTo to;

    /**
     * The number which will be displayed to the called party
     */
    public MakeRingOutCallerInfoRequestTo callerId;

    /**
     * The audio prompt that the calling party hears when the call is connected
     */
    public Boolean playPrompt;

    /**
     * Optional. Dialing plan country data. If not specified, then extension home country is applied by default
     */
    public MakeRingOutCoutryInfo country;
}
