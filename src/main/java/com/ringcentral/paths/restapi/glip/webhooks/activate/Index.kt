package com.ringcentral.paths.restapi.glip.webhooks.activate

class Index(val parent: com.ringcentral.paths.restapi.glip.webhooks.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/activate"
    }

    /// <summary>
    /// Operation: Activate Webhook
    /// Http Post /restapi/v1.0/glip/webhooks/{webhookId}/activate
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.webhooks.Index.activate(): Index {
        return Index(this)
    }
}
