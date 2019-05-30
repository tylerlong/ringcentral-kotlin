package com.ringcentral.definitions;


public class FaxResponse {
    /// <summary>
    /// Internal identifier of a message
    /// </summary>
    public Long id;

    /// <summary>
    /// Canonical URI of a message
    /// </summary>
    public String uri;

    /// <summary>
    /// Message type - 'Fax'
    /// </summary>
    public String type;

    /// <summary>
    /// Sender information
    /// </summary>
    public CallerInfoFrom from;

    /// <summary>
    /// Recipient information
    /// </summary>
    public CallerInfoTo[] to;

    /// <summary>
    /// Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Message read status
    /// Enum: Read, Unread
    /// </summary>
    public String readStatus;

    /// <summary>
    /// Message priority
    /// Enum: Normal, High
    /// </summary>
    public String priority;

    /// <summary>
    /// The list of message attachments
    /// </summary>
    public MessageAttachmentInfoIntId[] attachments;

    /// <summary>
    /// Message direction
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
    /// Enum: Alive, Deleted, Purged
    /// </summary>
    public String availability;

    /// <summary>
    /// Message status. 'Queued' - the message is queued for sending; 'Sent' - a message is successfully sent; 'SendingFailed' - a message sending attempt has failed; 'Received' - a message is received (inbound messages have this status by default)
    /// Enum: Queued, Sent, SendingFailed, Received
    /// </summary>
    public String messageStatus;

    /// <summary>
    /// Resolution of a fax message. ('High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi)
    /// Enum: High, Low
    /// </summary>
    public String faxResolution;

    /// <summary>
    /// Page count in a fax message
    /// </summary>
    public Long faxPageCount;

    /// <summary>
    /// Datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Cover page identifier. For the list of available cover page identifiers please call the Fax Cover Pages method
    /// </summary>
    public Long coverIndex;

    /// <summary>
    /// Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
    /// </summary>
    public String coverPageText;
}
