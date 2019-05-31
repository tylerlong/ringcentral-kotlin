package com.ringcentral.paths.restapi.subscription.renew

class Index(val parent: com.ringcentral.paths.restapi.subscription.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/renew"
    }

    /**
     * Operation: Renew Subscription
     * Http Post /restapi/v1.0/subscription/{subscriptionId}/renew
     */
    fun post(): com.ringcentral.definitions.SubscriptionInfo? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.SubscriptionInfo::class.java)
    }

}
