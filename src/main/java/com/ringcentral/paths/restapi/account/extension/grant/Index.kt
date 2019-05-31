package com.ringcentral.paths.restapi.account.extension.grant

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/grant"
    }

    /// <summary>
    /// Operation: Get Extension Grant List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/grant
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListExtensionGrantsParameters? = null): com.ringcentral.definitions.GetExtensionGrantListResponse
    // public async Task<com.ringcentral.definitions.GetExtensionGrantListResponse> Get(queryParams: com.ringcentral.definitions.ListExtensionGrantsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetExtensionGrantListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionGrantListResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.grant(): Index {
        return Index(this)
    }
}
