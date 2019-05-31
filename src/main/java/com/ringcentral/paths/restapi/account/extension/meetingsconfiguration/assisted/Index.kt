package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/assisted"
    }

    /// <summary>
    /// Operation: Get Assisted Users
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted
    /// </summary>
    fun get(): com.ringcentral.definitions.AssistedUsersResource
    // public async Task<com.ringcentral.definitions.AssistedUsersResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AssistedUsersResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.AssistedUsersResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index.assisted(): Index {
        return Index(this)
    }
}
