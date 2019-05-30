package com.ringcentral.definitions;


public class DeleteMessageParameters {
    /**
     * If the value is 'True', then the message is purged immediately with all the attachments
     */
    public Boolean purge;

    /**
     * Internal identifier of a message thread
     */
    public Long conversationId;
}
