package com.ringcentral.definitions;


public class DeleteMessageByFilterParameters {
    /**
     *
     */
    public String[] conversationId;

    /**
     * Messages received earlier then the date specified will be deleted. The default value is 'Now'
     */
    public String dateTo;

    /**
     * Type of messages to be deleted
     * Default: All
     * Enum: Fax, SMS, VoiceMail, Pager, Text, All
     */
    public String type;
}
