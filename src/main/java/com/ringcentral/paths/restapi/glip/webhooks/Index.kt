package com.ringcentral.paths.restapi.glip.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val webhookId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && webhookId != null) {
            return "${parent.path()}/webhooks/${webhookId}"
        }

        return "${parent.path()}/webhooks"
    }

    /// <summary>
    /// Operation: Get Webhooks
    /// Http Get /restapi/v1.0/glip/webhooks
    /// </summary>
    fun list(): com.ringcentral.definitions.GlipWebhookList
    // public async Task<com.ringcentral.definitions.GlipWebhookList> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.GlipWebhookList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipWebhookList>(this.path(false));
    }

    /// <summary>
    /// Operation: Get Webhook
    /// Http Get /restapi/v1.0/glip/webhooks/{webhookId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipWebhookList
    // public async Task<com.ringcentral.definitions.GlipWebhookList> Get()
    {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipWebhookList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipWebhookList>(this.path());
    }

    /// <summary>
    /// Operation: Delete Webhook
    /// Http Delete /restapi/v1.0/glip/webhooks/{webhookId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.webhooks(webhookId: String? = null): Index {
        return Index(this, webhookId)
    }
}
