package com.ringcentral.paths.restapi.account.businessaddress

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-address"
    }

    /// <summary>
    /// Operation: Get Account Business Address
    /// Http Get /restapi/v1.0/account/{accountId}/business-address
    /// </summary>
    fun get(): com.ringcentral.definitions.AccountBusinessAddressResource
    // public async Task<com.ringcentral.definitions.AccountBusinessAddressResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.AccountBusinessAddressResource>(this.path());
    }

    /// <summary>
    /// Operation: Update Company Business Address
    /// Http Put /restapi/v1.0/account/{accountId}/business-address
    /// </summary>
    fun put(modifyAccountBusinessAddressRequest: com.ringcentral.definitions.ModifyAccountBusinessAddressRequest): com.ringcentral.definitions.AccountBusinessAddressResource
    // public async Task<com.ringcentral.definitions.AccountBusinessAddressResource> Put(modifyAccountBusinessAddressRequest: com.ringcentral.definitions.ModifyAccountBusinessAddressRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), modifyAccountBusinessAddressRequest).string(), com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.AccountBusinessAddressResource>(this.path(), modifyAccountBusinessAddressRequest);
    }

    fun com.ringcentral.paths.restapi.account.Index.businessaddress(): Index {
        return Index(this)
    }
}
