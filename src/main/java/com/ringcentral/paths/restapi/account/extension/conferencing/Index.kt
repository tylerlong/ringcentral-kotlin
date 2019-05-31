package com.ringcentral.paths.restapi.account.extension.conferencing

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/conferencing"
    }

    /// <summary>
    /// Operation: Get User Conferencing Settings
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadConferencingSettingsParameters? = null): com.ringcentral.definitions.GetConferencingInfoResponse
    // public async Task<com.ringcentral.definitions.GetConferencingInfoResponse> Get(queryParams: com.ringcentral.definitions.ReadConferencingSettingsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetConferencingInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetConferencingInfoResponse>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Update User Conferencing Settings
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing
    /// </summary>
    fun put(updateConferencingInfoRequest: com.ringcentral.definitions.UpdateConferencingInfoRequest): com.ringcentral.definitions.GetConferencingInfoResponse
    // public async Task<com.ringcentral.definitions.GetConferencingInfoResponse> Put(updateConferencingInfoRequest: com.ringcentral.definitions.UpdateConferencingInfoRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), updateConferencingInfoRequest).string(), com.ringcentral.definitions.GetConferencingInfoResponse::class.java)
        // return await rc.Put<com.ringcentral.definitions.GetConferencingInfoResponse>(this.path(), updateConferencingInfoRequest);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.conferencing(): Index {
        return Index(this)
    }
}
