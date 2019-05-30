package com.ringcentral.definitions;


public class GlipConversationInfo {
    /**
     * Internal identifier of a conversation
     */
    public String id;

    /**
     * Type of a conversation
     * Enum: Direct, Personal, Group
     */
    public String type;

    /**
     * Conversation creation datetime in ISO 8601 format
     */
    public String creationTime;

    /**
     * Conversation last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;

    /**
     *
     */
    public GlipChatMemberInfo[] members;
}
