package com.ringcentral.paths.restapi.glip.teams.unarchive

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unarchive"
    }

    /// <summary>
    /// Operation: Unarchive Team
    /// Http Post /restapi/v1.0/glip/teams/{chatId}/unarchive
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.teams.Index.unarchive(): Index {
        return Index(this)
    }
}
