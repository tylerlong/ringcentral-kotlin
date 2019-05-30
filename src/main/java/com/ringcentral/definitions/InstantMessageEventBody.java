package com.ringcentral.definitions;


public class InstantMessageEventBody {
    /// <summary>
    /// Internal identifier of a message
    /// </summary>
    public String id;

    /// <summary>
    /// Message receiver(s) information
    /// </summary>
    public NotificationRecipientInfo[] to;

    /// <summary>
    /// Extension Type. For GCM transport type '_from' property should be used
    /// </summary>
    public SenderInfo from;

    /// <summary>
    /// Type of a message. The default value is 'SMS'
    /// </summary>
    public String type;

    /// <summary>
    /// Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Status of a message
    /// Default: Unread
    /// </summary>
    public String readStatus;

    /// <summary>
    /// Default: Normal
    /// </summary>
    public String priority;

    /// <summary>
    /// Message attachment data
    /// </summary>
    public MessageAttachmentInfo[] attachments;

    /// <summary>
    /// Message direction
    /// Default: Inbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Message availability status
    /// Default: Alive
    /// </summary>
    public String availability;

    /// <summary>
    /// Message subject. It replicates message text which is also returned as an attachment
    /// </summary>
    public String subject;

    /// <summary>
    /// Status of a message
    /// Default: Received
    /// </summary>
    public String messageStatus;

    /// <summary>
    /// Deprecated. Identifier of a conversation the message belongs to
    /// </summary>
    public String conversationId;

    /// <summary>
    /// Information about a conversation the message belongs to
    /// </summary>
    public ConversationInfo conversation;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
