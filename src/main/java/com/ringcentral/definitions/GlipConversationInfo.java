package com.ringcentral.definitions;


public class GlipConversationInfo {
    /// <summary>
    /// Internal identifier of a conversation
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a conversation
    /// Enum: Direct, Personal, Group
    /// </summary>
    public String type;

    /// <summary>
    /// Conversation creation datetime in ISO 8601 format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Conversation last change datetime in ISO 8601 format
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// </summary>
    public GlipChatMemberInfo[] members;
}
