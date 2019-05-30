package com.ringcentral.definitions;


public class MessageEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    /**
     * Datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastUpdated;

    /**
     * Message Changes
     */
    public MessageChanges[] changes;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
