package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipPostTeamBody {
    /// <summary>
    /// Team access level.
    /// </summary>
    @JSONField(name = "public")
    public Boolean _public;

    /// <summary>
    /// Team name.
    /// Required
    /// </summary>
    public String name;

    /// <summary>
    /// Team description.
    /// </summary>
    public String description;

    /// <summary>
    /// Identifier(s) of team members.
    /// </summary>
    public Object[] members;
}
