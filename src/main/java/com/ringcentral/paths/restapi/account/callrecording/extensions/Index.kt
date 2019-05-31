package com.ringcentral.paths.restapi.account.callrecording.extensions

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/extensions"
    }

    /// <summary>
    /// Operation: Get Call Recording Extension List
    /// Http Get /restapi/v1.0/account/{accountId}/call-recording/extensions
    /// </summary>
    fun get(): com.ringcentral.definitions.CallRecordingExtensions
    // public async Task<com.ringcentral.definitions.CallRecordingExtensions> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CallRecordingExtensions::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallRecordingExtensions>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.callrecording.Index.extensions(): Index {
        return Index(this)
    }
}
