package com.ringcentral.paths.restapi.account.extension

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val extensionId: String? = "~") {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && extensionId != null) {
            return "${parent.path()}/extension/${extensionId}"
        }

        return "${parent.path()}/extension"
    }

    /// <summary>
    /// Operation: Get Extension List
    /// Http Get /restapi/v1.0/account/{accountId}/extension
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListExtensionsParameters? = null): com.ringcentral.definitions.GetExtensionListResponse
    // public async Task<com.ringcentral.definitions.GetExtensionListResponse> List(queryParams: com.ringcentral.definitions.ListExtensionsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetExtensionListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionListResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Extension
    /// Http Post /restapi/v1.0/account/{accountId}/extension
    /// </summary>
    fun post(extensionCreationRequest: com.ringcentral.definitions.ExtensionCreationRequest): com.ringcentral.definitions.ExtensionCreationResponse
    // public async Task<com.ringcentral.definitions.ExtensionCreationResponse> Post(extensionCreationRequest: com.ringcentral.definitions.ExtensionCreationRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), extensionCreationRequest).string(), com.ringcentral.definitions.ExtensionCreationResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.ExtensionCreationResponse>(this.path(false), extensionCreationRequest);
    }

    /// <summary>
    /// Operation: Get Extension
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetExtensionInfoResponse
    // public async Task<com.ringcentral.definitions.GetExtensionInfoResponse> Get()
    {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetExtensionInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionInfoResponse>(this.path());
    }

    /// <summary>
    /// Operation: Update Extension
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}
    /// </summary>
    fun put(extensionUpdateRequest: com.ringcentral.definitions.ExtensionUpdateRequest): com.ringcentral.definitions.GetExtensionInfoResponse
    // public async Task<com.ringcentral.definitions.GetExtensionInfoResponse> Put(extensionUpdateRequest: com.ringcentral.definitions.ExtensionUpdateRequest)
    {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), extensionUpdateRequest).string(), com.ringcentral.definitions.GetExtensionInfoResponse::class.java)
        // return await rc.Put<com.ringcentral.definitions.GetExtensionInfoResponse>(this.path(), extensionUpdateRequest);
    }

    /// <summary>
    /// Operation: Delete Extension
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.extensionId == null) {
            throw NullPointerException("extensionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.extension(extensionId: String? = "~"): Index {
        return Index(this, extensionId)
    }
}
