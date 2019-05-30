package com.ringcentral.definitions;


public class InboundMessageEvent {
    /// <summary>
    /// Information on a notification
    /// </summary>
    public NotificationInfo aps;

    /// <summary>
    /// Internal identifier of a message
    /// </summary>
    public String messageId;

    /// <summary>
    /// Internal identifier of an conversation
    /// </summary>
    public String conversationId;

    /// <summary>
    /// Sender phone number. For GCM transport type '_from' property should be used
    /// </summary>
    public String from;

    /// <summary>
    /// Receiver phone number
    /// </summary>
    public String to;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
