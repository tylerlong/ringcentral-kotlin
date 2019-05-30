package com.ringcentral.definitions;


public class SyncMessagesParameters {
    /**
     * Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
     */
    public Long conversationId;

    /**
     * The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
     */
    public String dateFrom;

    /**
     * The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     */
    public String dateTo;

    /**
     * Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
     */
    public String[] direction;

    /**
     * If 'True', then the latest messages per every conversation ID are returned
     */
    public Boolean distinctConversations;

    /**
     * Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
     */
    public String[] messageType;

    /**
     * Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
     */
    public Long recordCount;

    /**
     * Value of syncToken property of last sync request response
     */
    public String syncToken;

    /**
     * Type of message synchronization
     */
    public String[] syncType;
}
