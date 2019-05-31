package com.ringcentral.paths.restapi.account.callrecording

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-recording"
    }

    /// <summary>
    /// Operation: Get Call Recording Settings
    /// Http Get /restapi/v1.0/account/{accountId}/call-recording
    /// </summary>
    fun get(): com.ringcentral.definitions.CallRecordingSettingsResource
    // public async Task<com.ringcentral.definitions.CallRecordingSettingsResource> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CallRecordingSettingsResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallRecordingSettingsResource>(this.path());
    }

    /// <summary>
    /// Operation: Update Call Recording Settings
    /// Http Put /restapi/v1.0/account/{accountId}/call-recording
    /// </summary>
    fun put(callRecordingSettingsResource: com.ringcentral.definitions.CallRecordingSettingsResource): com.ringcentral.definitions.CallRecordingSettingsResource
    // public async Task<com.ringcentral.definitions.CallRecordingSettingsResource> Put(callRecordingSettingsResource: com.ringcentral.definitions.CallRecordingSettingsResource)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), callRecordingSettingsResource).string(), com.ringcentral.definitions.CallRecordingSettingsResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.CallRecordingSettingsResource>(this.path(), callRecordingSettingsResource);
    }

    fun com.ringcentral.paths.restapi.account.Index.callrecording(): Index {
        return Index(this)
    }
}
