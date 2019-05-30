package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipTeamInfo {
    /**
     * Internal identifier of a team
     */
    public String id;

    /**
     * Type of a chat
     * Enum: Team
     */
    public String type;

    /**
     * Team access level
     */
    @JSONField(name = "public")
    public Boolean _public;

    /**
     * Team name
     */
    public String name;

    /**
     * Team description
     */
    public String description;

    /**
     * Team status
     * Enum: Active, Archived
     */
    public String status;

    /**
     * Team creation datetime in ISO 8601 format
     */
    public String creationTime;

    /**
     * Team last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;
}
