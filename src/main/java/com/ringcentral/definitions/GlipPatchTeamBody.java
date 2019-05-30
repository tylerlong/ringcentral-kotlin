package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipPatchTeamBody {
    /// <summary>
    /// Team access level
    /// </summary>
    @JSONField(name = "public")
    public Boolean _public;

    /// <summary>
    /// Team name. Maximum number of characters supported is 250
    /// </summary>
    public String name;

    /// <summary>
    /// Team description. Maximum number of characters supported is 1000
    /// </summary>
    public String description;
}
