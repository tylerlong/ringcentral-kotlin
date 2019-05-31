package com.ringcentral.paths.restapi.account.extension.presence

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/presence"
    }

    /// <summary>
    /// Operation: Get User Presence Status
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadUserPresenceStatusParameters? = null): com.ringcentral.definitions.GetPresenceInfo
    // public async Task<com.ringcentral.definitions.GetPresenceInfo> Get(queryParams: com.ringcentral.definitions.ReadUserPresenceStatusParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetPresenceInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetPresenceInfo>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Update User Presence Status
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
    /// </summary>
    fun put(presenceInfoResource: com.ringcentral.definitions.PresenceInfoResource): com.ringcentral.definitions.PresenceInfoResource
    // public async Task<com.ringcentral.definitions.PresenceInfoResource> Put(presenceInfoResource: com.ringcentral.definitions.PresenceInfoResource)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), presenceInfoResource).string(), com.ringcentral.definitions.PresenceInfoResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.PresenceInfoResource>(this.path(), presenceInfoResource);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.presence(): Index {
        return Index(this)
    }
}
