package com.ringcentral.paths.restapi.subscription

class Index(val parent: com.ringcentral.paths.restapi.Index, val subscriptionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && subscriptionId != null) {
            return "${parent.path()}/subscription/${subscriptionId}"
        }

        return "${parent.path()}/subscription"
    }

    /**
     * Operation: Get Subscriptions
     * Http Get /restapi/v1.0/subscription
     */
    fun list(): com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse::class.java)
    }

    /**
     * Operation: Create Subscription
     * Http Post /restapi/v1.0/subscription
     */
    fun post(createSubscriptionRequest: com.ringcentral.definitions.CreateSubscriptionRequest): com.ringcentral.definitions.SubscriptionInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createSubscriptionRequest).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
    }

    /**
     * Operation: Get Subscription
     * Http Get /restapi/v1.0/subscription/{subscriptionId}
     */
    fun get(): com.ringcentral.definitions.SubscriptionInfo {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
    }

    /**
     * Operation: Renew Subscription / Update Event Filters
     * Http Put /restapi/v1.0/subscription/{subscriptionId}
     */
    @JvmOverloads
    fun put(modifySubscriptionRequest: com.ringcentral.definitions.ModifySubscriptionRequest, queryParams: com.ringcentral.definitions.UpdateSubscriptionParameters? = null): com.ringcentral.definitions.SubscriptionInfo {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), modifySubscriptionRequest, queryParams).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
    }

    /**
     * Operation: Cancel Subscription
     * Http Delete /restapi/v1.0/subscription/{subscriptionId}
     */
    fun delete(): String {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }


    fun renew(): com.ringcentral.paths.restapi.subscription.renew.Index {
        return com.ringcentral.paths.restapi.subscription.renew.Index(this)
    }

}