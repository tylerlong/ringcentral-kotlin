package com.ringcentral.definitions;


public class CallSessionObject {
    /// <summary>
    /// Internal identifier of a call session
    /// </summary>
    public String id;

    /// <summary>
    /// Initial data of a call session
    /// </summary>
    public OriginInfo origin;

    /// <summary>
    /// For calls of 'Conference' type only
    /// </summary>
    public String voiceCallToken;

    /// <summary>
    /// Information on a party of a call session
    /// </summary>
    public CallParty parties;

    /// <summary>
    /// Date and time of the latest session update represented in Unix time format
    /// </summary>
    public String creationTime;
}
