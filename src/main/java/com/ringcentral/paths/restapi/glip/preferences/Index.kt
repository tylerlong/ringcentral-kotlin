package com.ringcentral.paths.restapi.glip.preferences

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/preferences"
    }

    /// <summary>
    /// Operation: Get Preferences
    /// Http Get /restapi/v1.0/glip/preferences
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipPreferencesInfo
    // public async Task<com.ringcentral.definitions.GlipPreferencesInfo> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipPreferencesInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipPreferencesInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.preferences(): Index {
        return Index(this)
    }
}
