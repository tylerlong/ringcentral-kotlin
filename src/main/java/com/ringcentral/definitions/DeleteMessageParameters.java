package com.ringcentral.definitions;


public class DeleteMessageParameters {
    /// <summary>
    /// If the value is 'True', then the message is purged immediately with all the attachments
    /// </summary>
    public Boolean purge;

    /// <summary>
    /// Internal identifier of a message thread
    /// </summary>
    public Long conversationId;
}
