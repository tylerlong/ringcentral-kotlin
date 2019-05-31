package com.ringcentral.paths.restapi.account.extension.forwardingnumber

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val forwardingNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && forwardingNumberId != null) {
            return "${parent.path()}/forwarding-number/${forwardingNumberId}"
        }

        return "${parent.path()}/forwarding-number"
    }

    /// <summary>
    /// Operation: Get Forwarding Number List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListForwardingNumbersParameters? = null): com.ringcentral.definitions.GetExtensionForwardingNumberListResponse
    // public async Task<com.ringcentral.definitions.GetExtensionForwardingNumberListResponse> List(queryParams: com.ringcentral.definitions.ListForwardingNumbersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetExtensionForwardingNumberListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionForwardingNumberListResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Forwarding Number
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number
    /// </summary>
    fun post(createForwardingNumberRequest: com.ringcentral.definitions.CreateForwardingNumberRequest): com.ringcentral.definitions.ForwardingNumberInfo
    // public async Task<com.ringcentral.definitions.ForwardingNumberInfo> Post(createForwardingNumberRequest: com.ringcentral.definitions.CreateForwardingNumberRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createForwardingNumberRequest).string(), com.ringcentral.definitions.ForwardingNumberInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.ForwardingNumberInfo>(this.path(false), createForwardingNumberRequest);
    }

    /// <summary>
    /// Operation: Get Forwarding Number
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
    /// </summary>
    fun get(): com.ringcentral.definitions.ForwardingNumberResource
    // public async Task<com.ringcentral.definitions.ForwardingNumberResource> Get()
    {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.ForwardingNumberResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.ForwardingNumberResource>(this.path());
    }

    /// <summary>
    /// Operation: Update Forwarding Number
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
    /// </summary>
    fun put(updateForwardingNumberRequest: com.ringcentral.definitions.UpdateForwardingNumberRequest): com.ringcentral.definitions.ForwardingNumberInfo
    // public async Task<com.ringcentral.definitions.ForwardingNumberInfo> Put(updateForwardingNumberRequest: com.ringcentral.definitions.UpdateForwardingNumberRequest)
    {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), updateForwardingNumberRequest).string(), com.ringcentral.definitions.ForwardingNumberInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.ForwardingNumberInfo>(this.path(), updateForwardingNumberRequest);
    }

    /// <summary>
    /// Operation: Delete Forwarding Number
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.forwardingNumberId == null) {
            throw NullPointerException("forwardingNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.forwardingnumber(forwardingNumberId: String? = null): Index {
        return Index(this, forwardingNumberId)
    }
}
