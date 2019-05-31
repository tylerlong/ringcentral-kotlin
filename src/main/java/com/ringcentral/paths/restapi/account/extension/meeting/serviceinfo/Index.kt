package com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/service-info"
    }

    /// <summary>
    /// Operation: Get Meeting Service Info
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info
    /// </summary>
    fun get(): com.ringcentral.definitions.MeetingServiceInfoResource
    // public async Task<com.ringcentral.definitions.MeetingServiceInfoResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.MeetingServiceInfoResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.MeetingServiceInfoResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.meeting.Index.serviceinfo(): Index {
        return Index(this)
    }
}
