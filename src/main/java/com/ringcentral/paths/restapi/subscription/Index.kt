package com.ringcentral.paths.restapi.subscription

class Index(val parent: com.ringcentral.paths.restapi.Index, val subscriptionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && subscriptionId != null) {
            return "${parent.path()}/subscription/${subscriptionId}"
        }

        return "${parent.path()}/subscription"
    }

    /// <summary>
    /// Operation: Get Subscriptions
    /// Http Get /restapi/v1.0/subscription
    /// </summary>
    fun list(): com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse
    // public async Task<com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse>(this.path(false));
    }

    /// <summary>
    /// Operation: Create Subscription
    /// Http Post /restapi/v1.0/subscription
    /// </summary>
    fun post(createSubscriptionRequest: com.ringcentral.definitions.CreateSubscriptionRequest): com.ringcentral.definitions.SubscriptionInfo
    // public async Task<com.ringcentral.definitions.SubscriptionInfo> Post(createSubscriptionRequest: com.ringcentral.definitions.CreateSubscriptionRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createSubscriptionRequest).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.SubscriptionInfo>(this.path(false), createSubscriptionRequest);
    }

    /// <summary>
    /// Operation: Get Subscription
    /// Http Get /restapi/v1.0/subscription/{subscriptionId}
    /// </summary>
    fun get(): com.ringcentral.definitions.SubscriptionInfo
    // public async Task<com.ringcentral.definitions.SubscriptionInfo> Get()
    {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.SubscriptionInfo>(this.path());
    }

    /// <summary>
    /// Operation: Renew Subscription / Update Event Filters
    /// Http Put /restapi/v1.0/subscription/{subscriptionId}
    /// </summary>
    fun put(modifySubscriptionRequest: com.ringcentral.definitions.ModifySubscriptionRequest, queryParams: com.ringcentral.definitions.UpdateSubscriptionParameters? = null): com.ringcentral.definitions.SubscriptionInfo
    // public async Task<com.ringcentral.definitions.SubscriptionInfo> Put(modifySubscriptionRequest: com.ringcentral.definitions.ModifySubscriptionRequest, queryParams: com.ringcentral.definitions.UpdateSubscriptionParameters? = null)
    {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), modifySubscriptionRequest, queryParams).string(), com.ringcentral.definitions.SubscriptionInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.SubscriptionInfo>(this.path(), modifySubscriptionRequest, queryParams);
    }

    /// <summary>
    /// Operation: Cancel Subscription
    /// Http Delete /restapi/v1.0/subscription/{subscriptionId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.subscriptionId == null) {
            throw NullPointerException("subscriptionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.Index.subscription(subscriptionId: String? = null): Index {
        return Index(this, subscriptionId)
    }
}
