package com.ringcentral.paths.restapi.glip.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val webhookId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && webhookId != null) {
            return "${parent.path()}/webhooks/${webhookId}"
        }

        return "${parent.path()}/webhooks"
    }

    /**
     * Operation: Get Webhooks
     * Http Get /restapi/v1.0/glip/webhooks
     */
    fun list(): com.ringcentral.definitions.GlipWebhookList? {
        val str: String? = rc.get(this.path(false)).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipWebhookList::class.java)
    }


    /**
     * Operation: Get Webhook
     * Http Get /restapi/v1.0/glip/webhooks/{webhookId}
     */
    fun get(): com.ringcentral.definitions.GlipWebhookList? {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipWebhookList::class.java)
    }


    /**
     * Operation: Delete Webhook
     * Http Delete /restapi/v1.0/glip/webhooks/{webhookId}
     */
    fun delete(): String? {
        if (this.webhookId == null) {
            throw NullPointerException("webhookId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    fun activate(): com.ringcentral.paths.restapi.glip.webhooks.activate.Index {
        return com.ringcentral.paths.restapi.glip.webhooks.activate.Index(this)
    }


    fun suspend(): com.ringcentral.paths.restapi.glip.webhooks.suspend.Index {
        return com.ringcentral.paths.restapi.glip.webhooks.suspend.Index(this)
    }

}