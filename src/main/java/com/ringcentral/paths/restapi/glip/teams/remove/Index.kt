package com.ringcentral.paths.restapi.glip.teams.remove

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/remove"
    }

    /// <summary>
    /// Operation: Remove Team Members
    /// Http Post /restapi/v1.0/glip/teams/{chatId}/remove
    /// </summary>
    fun post(glipPostMembersIdsListBody: com.ringcentral.definitions.GlipPostMembersIdsListBody): String
    // public async Task<String> Post(glipPostMembersIdsListBody: com.ringcentral.definitions.GlipPostMembersIdsListBody)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), glipPostMembersIdsListBody).string(), String::class.java)
        // return await rc.Post<String>(this.path(), glipPostMembersIdsListBody);
    }

    fun com.ringcentral.paths.restapi.glip.teams.Index.remove(): Index {
        return Index(this)
    }
}
