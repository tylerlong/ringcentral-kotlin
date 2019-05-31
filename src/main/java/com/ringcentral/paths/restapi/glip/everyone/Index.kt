package com.ringcentral.paths.restapi.glip.everyone

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/everyone"
    }

    /// <summary>
    /// Operation: Get Everyone Chat
    /// Http Get /restapi/v1.0/glip/everyone
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipEveryoneInfo
    // public async Task<com.ringcentral.definitions.GlipEveryoneInfo> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipEveryoneInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipEveryoneInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Everyone Сhat
    /// Http Patch /restapi/v1.0/glip/everyone
    /// </summary>
    fun patch(updateGlipEveryoneRequest: com.ringcentral.definitions.UpdateGlipEveryoneRequest): com.ringcentral.definitions.GlipEveryoneInfo
    // public async Task<com.ringcentral.definitions.GlipEveryoneInfo> Patch(updateGlipEveryoneRequest: com.ringcentral.definitions.UpdateGlipEveryoneRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), updateGlipEveryoneRequest).string(), com.ringcentral.definitions.GlipEveryoneInfo::class.java)
        // return await rc.Patch<com.ringcentral.definitions.GlipEveryoneInfo>(this.path(), updateGlipEveryoneRequest);
    }

    fun com.ringcentral.paths.restapi.glip.Index.everyone(): Index {
        return Index(this)
    }
}
