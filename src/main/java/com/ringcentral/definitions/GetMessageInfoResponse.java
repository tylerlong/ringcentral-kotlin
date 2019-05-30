package com.ringcentral.definitions;


public class GetMessageInfoResponse {
    /// <summary>
    /// Internal identifier of a message
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a message
    /// </summary>
    public String uri;

    /// <summary>
    /// The list of message attachments
    /// </summary>
    public MessageAttachmentInfo[] attachments;

    /// <summary>
    /// Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
    /// Enum: Alive, Deleted, Purged
    /// </summary>
    public String availability;

    /// <summary>
    /// SMS and Pager only. Identifier of a conversation the message belongs to
    /// </summary>
    public Long conversationId;

    /// <summary>
    /// SMS and Pager only. Identifier of a conversation the message belongs to
    /// </summary>
    public ConversationInfo conversation;

    /// <summary>
    /// Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String creationTime;

    /// <summary>
    /// SMS only. Delivery error code returned by gateway
    /// </summary>
    public String deliveryErrorCode;

    /// <summary>
    /// Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Fax only. Page count in a fax message
    /// </summary>
    public Long faxPageCount;

    /// <summary>
    /// Fax only. Resolution of a fax message. 'High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi
    /// Enum: High, Low
    /// </summary>
    public String faxResolution;

    /// <summary>
    /// Sender information
    /// </summary>
    public MessageStoreCallerInfoResponse from;

    /// <summary>
    /// The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Message status. Different message types may have different allowed status values.For outbound faxes the aggregated message status is returned: If status for at least one recipient is 'Queued', then 'Queued' value is returned If status for at least one recipient is 'SendingFailed', then 'SendingFailed' value is returned In other cases Sent status is returned
    /// Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
    /// </summary>
    public String messageStatus;

    /// <summary>
    /// 'Pager' only. 'True' if at least one of the message recipients is 'Department' extension
    /// </summary>
    public Boolean pgToDepartment;

    /// <summary>
    /// Message priority
    /// Enum: Normal, High
    /// </summary>
    public String priority;

    /// <summary>
    /// Message read status
    /// Enum: Read, Unread
    /// </summary>
    public String readStatus;

    /// <summary>
    /// SMS only. The datetime when outbound SMS was delivered to recipient's handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral
    /// </summary>
    public String smsDeliveryTime;

    /// <summary>
    /// SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable)
    /// </summary>
    public Long smsSendingAttemptsCount;

    /// <summary>
    /// Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
    /// </summary>
    public String subject;

    /// <summary>
    /// Recipient information
    /// </summary>
    public MessageStoreCallerInfoResponse[] to;

    /// <summary>
    /// Message type
    /// Enum: Fax, SMS, VoiceMail, Pager, Text
    /// </summary>
    public String type;

    /// <summary>
    /// Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the 'NotAvailable' value is returned
    /// Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed
    /// </summary>
    public String vmTranscriptionStatus;
}
