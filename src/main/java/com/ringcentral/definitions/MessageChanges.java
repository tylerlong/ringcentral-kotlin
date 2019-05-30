package com.ringcentral.definitions;


public class MessageChanges {
    /// <summary>
    /// Message type
    /// Enum: Voicemail, SMS, Fax, Pager
    /// </summary>
    public String type;

    /// <summary>
    /// The number of new messages. Can be omitted if the value is zero
    /// </summary>
    public Long newCount;

    /// <summary>
    /// The number of updated messages. Can be omitted if the value is zero
    /// </summary>
    public Long updatedCount;
}
