package com.ringcentral.paths.restapi.account.directory.federation

class Index(val parent: com.ringcentral.paths.restapi.account.directory.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/federation"
    }

    /// <summary>
    /// Operation: Get Account Federation
    /// Http Get /restapi/v1.0/account/{accountId}/directory/federation
    /// </summary>
    fun get(): com.ringcentral.definitions.FederationResource
    // public async Task<com.ringcentral.definitions.FederationResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.FederationResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.FederationResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.directory.Index.federation(): Index {
        return Index(this)
    }
}
