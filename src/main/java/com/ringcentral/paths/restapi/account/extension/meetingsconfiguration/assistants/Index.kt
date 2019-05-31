package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/assistants"
    }

    /// <summary>
    /// Operation: Get Assistants
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants
    /// </summary>
    fun get(): com.ringcentral.definitions.AssistantsResource
    // public async Task<com.ringcentral.definitions.AssistantsResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AssistantsResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.AssistantsResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index.assistants(): Index {
        return Index(this)
    }
}
