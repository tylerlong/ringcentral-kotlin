package com.ringcentral.paths.restapi.subscription.renew

class Index(val parent: com.ringcentral.paths.restapi.subscription.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/renew"
    }

    /// <summary>
    /// Operation: Renew Subscription
    /// Http Post /restapi/v1.0/subscription/{subscriptionId}/renew
    /// </summary>
    fun post(): com.ringcentral.definitions.SubscriptionInfo
    // public async Task<com.ringcentral.definitions.SubscriptionInfo> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.SubscriptionInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.subscription.Index.renew(): Index {
        return Index(this)
    }
}
