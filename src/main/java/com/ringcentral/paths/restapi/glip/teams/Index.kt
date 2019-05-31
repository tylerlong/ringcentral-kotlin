package com.ringcentral.paths.restapi.glip.teams

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/teams/${chatId}"
        }

        return "${parent.path()}/teams"
    }

    /// <summary>
    /// Operation: Get Teams
    /// Http Get /restapi/v1.0/glip/teams
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListGlipTeamsParameters? = null): com.ringcentral.definitions.GlipTeamsList
    // public async Task<com.ringcentral.definitions.GlipTeamsList> List(queryParams: com.ringcentral.definitions.ListGlipTeamsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipTeamsList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipTeamsList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Team
    /// Http Post /restapi/v1.0/glip/teams
    /// </summary>
    fun post(glipPostTeamBody: com.ringcentral.definitions.GlipPostTeamBody): com.ringcentral.definitions.GlipTeamInfo
    // public async Task<com.ringcentral.definitions.GlipTeamInfo> Post(glipPostTeamBody: com.ringcentral.definitions.GlipPostTeamBody)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipPostTeamBody).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipTeamInfo>(this.path(false), glipPostTeamBody);
    }

    /// <summary>
    /// Operation: Get Team
    /// Http Get /restapi/v1.0/glip/teams/{chatId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipTeamInfo
    // public async Task<com.ringcentral.definitions.GlipTeamInfo> Get()
    {
        if (this.chatId == null) {
            throw NullPointerException("chatId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipTeamInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Team
    /// Http Patch /restapi/v1.0/glip/teams/{chatId}
    /// </summary>
    fun patch(glipPatchTeamBody: com.ringcentral.definitions.GlipPatchTeamBody): com.ringcentral.definitions.GlipTeamInfo
    // public async Task<com.ringcentral.definitions.GlipTeamInfo> Patch(glipPatchTeamBody: com.ringcentral.definitions.GlipPatchTeamBody)
    {
        if (this.chatId == null) {
            throw NullPointerException("chatId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), glipPatchTeamBody).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
        // return await rc.Patch<com.ringcentral.definitions.GlipTeamInfo>(this.path(), glipPatchTeamBody);
    }

    /// <summary>
    /// Operation: Delete Team
    /// Http Delete /restapi/v1.0/glip/teams/{chatId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.chatId == null) {
            throw NullPointerException("chatId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.teams(chatId: String? = null): Index {
        return Index(this, chatId)
    }
}
