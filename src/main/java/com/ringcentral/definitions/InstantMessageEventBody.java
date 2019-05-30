package com.ringcentral.definitions;


public class InstantMessageEventBody {
    /**
     * Internal identifier of a message
     */
    public String id;

    /**
     * Message receiver(s) information
     */
    public NotificationRecipientInfo[] to;

    /**
     * Extension Type. For GCM transport type '_from' property should be used
     */
    public SenderInfo from;

    /**
     * Type of a message. The default value is 'SMS'
     */
    public String type;

    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String creationTime;

    /**
     * Datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastModifiedTime;

    /**
     * Status of a message
     * Default: Unread
     */
    public String readStatus;

    /**
     * Default: Normal
     */
    public String priority;

    /**
     * Message attachment data
     */
    public MessageAttachmentInfo[] attachments;

    /**
     * Message direction
     * Default: Inbound
     */
    public String direction;

    /**
     * Message availability status
     * Default: Alive
     */
    public String availability;

    /**
     * Message subject. It replicates message text which is also returned as an attachment
     */
    public String subject;

    /**
     * Status of a message
     * Default: Received
     */
    public String messageStatus;

    /**
     * Deprecated. Identifier of a conversation the message belongs to
     */
    public String conversationId;

    /**
     * Information about a conversation the message belongs to
     */
    public ConversationInfo conversation;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
