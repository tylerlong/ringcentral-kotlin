package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipChatInfo {
    /// <summary>
    /// Internal identifier of a chat
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a chat
    /// Enum: Everyone, Team, Group, Direct, Personal
    /// </summary>
    public String type;

    /// <summary>
    /// For 'Team' chat type only. Team access level.
    /// </summary>
    @JSONField(name = "public")
    public Boolean _public;

    /// <summary>
    /// For 'Team','Everyone' chats types only. Chat name.
    /// </summary>
    public String name;

    /// <summary>
    /// For 'Team','Everyone' chats types only. Chat description.
    /// </summary>
    public String description;

    /// <summary>
    /// For 'Team' chat type only. Team status.
    /// Enum: Active, Archived
    /// </summary>
    public String status;

    /// <summary>
    /// Chat creation datetime in ISO 8601 format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Chat last change datetime in ISO 8601 format
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// </summary>
    public GlipChatMemberInfo[] members;
}
