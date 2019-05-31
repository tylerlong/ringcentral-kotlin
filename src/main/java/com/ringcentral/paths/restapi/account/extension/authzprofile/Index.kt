package com.ringcentral.paths.restapi.account.extension.authzprofile

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/authz-profile"
    }

    /// <summary>
    /// Operation: Get Authorization Profile
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile
    /// </summary>
    fun get(): com.ringcentral.definitions.AuthProfileResource
    // public async Task<com.ringcentral.definitions.AuthProfileResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AuthProfileResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.AuthProfileResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.authzprofile(): Index {
        return Index(this)
    }
}
