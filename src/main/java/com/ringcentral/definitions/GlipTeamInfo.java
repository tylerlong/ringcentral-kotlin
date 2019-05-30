package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipTeamInfo {
    /// <summary>
    /// Internal identifier of a team
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a chat
    /// Enum: Team
    /// </summary>
    public String type;

    /// <summary>
    /// Team access level
    /// </summary>
    @JSONField(name = "public")
    public Boolean _public;

    /// <summary>
    /// Team name
    /// </summary>
    public String name;

    /// <summary>
    /// Team description
    /// </summary>
    public String description;

    /// <summary>
    /// Team status
    /// Enum: Active, Archived
    /// </summary>
    public String status;

    /// <summary>
    /// Team creation datetime in ISO 8601 format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Team last change datetime in ISO 8601 format
    /// </summary>
    public String lastModifiedTime;
}
