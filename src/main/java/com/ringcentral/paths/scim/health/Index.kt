package com.ringcentral.paths.scim.health

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/health"
    }

    /// <summary>
    /// Operation: check health
    /// Http Get /scim/v2/health
    /// </summary>
    fun get(): String
    // public async Task<String> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
        // return await rc.Get<String>(this.path());
    }

    fun com.ringcentral.paths.scim.Index.health(): Index {
        return Index(this)
    }
}
