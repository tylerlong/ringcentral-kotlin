package com.ringcentral.definitions;


public class InboundMessageEvent {
    /**
     * Information on a notification
     */
    public NotificationInfo aps;

    /**
     * Internal identifier of a message
     */
    public String messageId;

    /**
     * Internal identifier of an conversation
     */
    public String conversationId;

    /**
     * Sender phone number. For GCM transport type '_from' property should be used
     */
    public String from;

    /**
     * Receiver phone number
     */
    public String to;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
