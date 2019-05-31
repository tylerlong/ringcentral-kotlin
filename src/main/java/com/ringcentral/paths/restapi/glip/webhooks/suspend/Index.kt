package com.ringcentral.paths.restapi.glip.webhooks.suspend

class Index(val parent: com.ringcentral.paths.restapi.glip.webhooks.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/suspend"
    }

    /// <summary>
    /// Operation: Suspend Webhook
    /// Http Post /restapi/v1.0/glip/webhooks/{webhookId}/suspend
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.webhooks.Index.suspend(): Index {
        return Index(this)
    }
}
