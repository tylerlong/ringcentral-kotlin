package com.ringcentral.definitions;


public class ReadCallSessionStatusParameters {
    /// <summary>
    /// The date and time of a call session latest change
    /// </summary>
    public String timestamp;

    /// <summary>
    /// The time frame of awaiting for a status change before sending the resulting one in response
    /// </summary>
    public String timeout;
}
