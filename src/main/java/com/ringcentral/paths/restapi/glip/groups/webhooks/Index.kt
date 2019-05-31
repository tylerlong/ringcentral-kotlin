package com.ringcentral.paths.restapi.glip.groups.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/webhooks"
    }

    /// <summary>
    /// Operation: Create Webhook in Group
    /// Http Post /restapi/v1.0/glip/groups/{groupId}/webhooks
    /// </summary>
    fun post(): com.ringcentral.definitions.GlipWebhookInfo
    // public async Task<com.ringcentral.definitions.GlipWebhookInfo> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), com.ringcentral.definitions.GlipWebhookInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipWebhookInfo>(this.path());
    }

    /// <summary>
    /// Operation: Get Webhooks in Group
    /// Http Get /restapi/v1.0/glip/groups/{groupId}/webhooks
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipWebhookList
    // public async Task<com.ringcentral.definitions.GlipWebhookList> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipWebhookList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipWebhookList>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.groups.Index.webhooks(): Index {
        return Index(this)
    }
}
