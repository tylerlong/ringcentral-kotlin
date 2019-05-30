package com.ringcentral.definitions;


public class DeleteMessageByFilterParameters {
    /// <summary>
    /// </summary>
    public String[] conversationId;

    /// <summary>
    /// Messages received earlier then the date specified will be deleted. The default value is 'Now'
    /// </summary>
    public String dateTo;

    /// <summary>
    /// Type of messages to be deleted
    /// Default: All
    /// Enum: Fax, SMS, VoiceMail, Pager, Text, All
    /// </summary>
    public String type;
}
