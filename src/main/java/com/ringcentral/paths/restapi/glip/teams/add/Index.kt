package com.ringcentral.paths.restapi.glip.teams.add

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/add"
    }

    /// <summary>
    /// Operation: Add Team Members
    /// Http Post /restapi/v1.0/glip/teams/{chatId}/add
    /// </summary>
    fun post(glipPostMembersListBody: com.ringcentral.definitions.GlipPostMembersListBody): String
    // public async Task<String> Post(glipPostMembersListBody: com.ringcentral.definitions.GlipPostMembersListBody)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), glipPostMembersListBody).string(), String::class.java)
        // return await rc.Post<String>(this.path(), glipPostMembersListBody);
    }

    fun com.ringcentral.paths.restapi.glip.teams.Index.add(): Index {
        return Index(this)
    }
}
