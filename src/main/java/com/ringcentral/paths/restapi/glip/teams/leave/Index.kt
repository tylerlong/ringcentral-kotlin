package com.ringcentral.paths.restapi.glip.teams.leave

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/leave"
    }

    /// <summary>
    /// Operation: Leave Team
    /// Http Post /restapi/v1.0/glip/teams/{chatId}/leave
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.teams.Index.leave(): Index {
        return Index(this)
    }
}
