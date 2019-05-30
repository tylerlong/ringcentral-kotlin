package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipPatchTeamBody {
    /**
     * Team access level
     */
    @JSONField(name = "public")
    public Boolean _public;

    /**
     * Team name. Maximum number of characters supported is 250
     */
    public String name;

    /**
     * Team description. Maximum number of characters supported is 1000
     */
    public String description;
}
