package com.ringcentral.paths.restapi.account.presence

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/presence"
    }

    /// <summary>
    /// Operation: Get User Presence Status List
    /// Http Get /restapi/v1.0/account/{accountId}/presence
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadAccountPresenceParameters? = null): com.ringcentral.definitions.AccountPresenceInfo
    // public async Task<com.ringcentral.definitions.AccountPresenceInfo> Get(queryParams: com.ringcentral.definitions.ReadAccountPresenceParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.AccountPresenceInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.AccountPresenceInfo>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.Index.presence(): Index {
        return Index(this)
    }
}
