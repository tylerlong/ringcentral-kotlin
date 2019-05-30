package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipPostTeamBody {
    /**
     * Team access level.
     */
    @JSONField(name = "public")
    public Boolean _public;

    /**
     * Team name.
     * Required
     */
    public String name;

    /**
     * Team description.
     */
    public String description;

    /**
     * Identifier(s) of team members.
     */
    public Object[] members;
}
