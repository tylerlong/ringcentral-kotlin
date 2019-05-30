package com.ringcentral.definitions;


public class MessageEventBody {
    /// <summary>
    /// Internal identifier of an extension
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String lastUpdated;

    /// <summary>
    /// Message Changes
    /// </summary>
    public MessageChanges[] changes;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
