package com.ringcentral.paths.restapi.status

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/status"
    }

    /// <summary>
    /// Operation: Get Service Status
    /// Http Get /restapi/v1.0/status
    /// </summary>
    fun get(): String
    // public async Task<String> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
        // return await rc.Get<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.Index.status(): Index {
        return Index(this)
    }
}
