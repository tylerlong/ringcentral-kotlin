package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipChatInfo {
    /**
     * Internal identifier of a chat
     */
    public String id;

    /**
     * Type of a chat
     * Enum: Everyone, Team, Group, Direct, Personal
     */
    public String type;

    /**
     * For 'Team' chat type only. Team access level.
     */
    @JSONField(name = "public")
    public Boolean _public;

    /**
     * For 'Team','Everyone' chats types only. Chat name.
     */
    public String name;

    /**
     * For 'Team','Everyone' chats types only. Chat description.
     */
    public String description;

    /**
     * For 'Team' chat type only. Team status.
     * Enum: Active, Archived
     */
    public String status;

    /**
     * Chat creation datetime in ISO 8601 format
     */
    public String creationTime;

    /**
     * Chat last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;

    /**
     *
     */
    public GlipChatMemberInfo[] members;
}
