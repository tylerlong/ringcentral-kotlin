package com.ringcentral.definitions;


public class SyncInfoMessages {
    /// <summary>
    /// Type of synchronization
    /// Enum: FSync, ISync
    /// </summary>
    public String syncType;

    /// <summary>
    /// Synchronization token
    /// </summary>
    public String syncToken;

    /// <summary>
    /// Last synchronization datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String syncTime;
}
