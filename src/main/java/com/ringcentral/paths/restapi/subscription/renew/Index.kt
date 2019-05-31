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
    fun post(): com.ringcentral.definitions.SubscriptionInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
    }
}
