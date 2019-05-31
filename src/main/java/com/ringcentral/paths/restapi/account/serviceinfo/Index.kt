package com.ringcentral.paths.restapi.account.serviceinfo

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/service-info"
    }

    /// <summary>
    /// Operation: Get Account Service Info
    /// Http Get /restapi/v1.0/account/{accountId}/service-info
    /// </summary>
    fun get(): com.ringcentral.definitions.GetServiceInfoResponse
    // public async Task<com.ringcentral.definitions.GetServiceInfoResponse> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetServiceInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetServiceInfoResponse>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.serviceinfo(): Index {
        return Index(this)
    }
}
