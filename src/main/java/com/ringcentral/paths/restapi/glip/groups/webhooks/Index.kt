package com.ringcentral.paths.restapi.glip.groups.webhooks

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/webhooks"
    }

    /**
     * Operation: Create Webhook in Group
     * Http Post /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    fun post(): com.ringcentral.definitions.GlipWebhookInfo? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipWebhookInfo::class.java)
    }


    /**
     * Operation: Get Webhooks in Group
     * Http Get /restapi/v1.0/glip/groups/{groupId}/webhooks
     */
    fun get(): com.ringcentral.definitions.GlipWebhookList? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipWebhookList::class.java)
    }

}
