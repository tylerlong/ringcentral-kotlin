package com.ringcentral.definitions;


public class SyncMessagesParameters {
    /// <summary>
    /// Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
    /// </summary>
    public Long conversationId;

    /// <summary>
    /// The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
    /// </summary>
    public String dateFrom;

    /// <summary>
    /// The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
    /// </summary>
    public String dateTo;

    /// <summary>
    /// Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
    /// </summary>
    public String[] direction;

    /// <summary>
    /// If 'True', then the latest messages per every conversation ID are returned
    /// </summary>
    public Boolean distinctConversations;

    /// <summary>
    /// Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
    /// </summary>
    public String[] messageType;

    /// <summary>
    /// Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
    /// </summary>
    public Long recordCount;

    /// <summary>
    /// Value of syncToken property of last sync request response
    /// </summary>
    public String syncToken;

    /// <summary>
    /// Type of message synchronization
    /// </summary>
    public String[] syncType;
}
