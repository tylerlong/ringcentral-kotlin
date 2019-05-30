package com.ringcentral.definitions;


public class ReadCallSessionStatusParameters {
    /**
     * The date and time of a call session latest change
     */
    public String timestamp;

    /**
     * The time frame of awaiting for a status change before sending the resulting one in response
     */
    public String timeout;
}
