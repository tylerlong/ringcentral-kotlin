package com.ringcentral.paths.restapi.account.ivrprompts.content

class Index(val parent: com.ringcentral.paths.restapi.account.ivrprompts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/content"
    }

    /// <summary>
    /// Operation: Get IVR Prompt Content
    /// Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content
    /// </summary>
    fun get(): String
    // public async Task<String> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
        // return await rc.Get<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.ivrprompts.Index.content(): Index {
        return Index(this)
    }
}
