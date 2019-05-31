package com.ringcentral.paths.restapi.account.extension.callerblocking

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/caller-blocking"
    }

    /// <summary>
    /// Operation: Get Caller Blocking Settings
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking
    /// </summary>
    fun get(): com.ringcentral.definitions.CallerBlockingSettings
    // public async Task<com.ringcentral.definitions.CallerBlockingSettings> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CallerBlockingSettings::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallerBlockingSettings>(this.path());
    }

    /// <summary>
    /// Operation: Update Caller Blocking Settings
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking
    /// </summary>
    fun put(callerBlockingSettingsUpdate: com.ringcentral.definitions.CallerBlockingSettingsUpdate): com.ringcentral.definitions.CallerBlockingSettings
    // public async Task<com.ringcentral.definitions.CallerBlockingSettings> Put(callerBlockingSettingsUpdate: com.ringcentral.definitions.CallerBlockingSettingsUpdate)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), callerBlockingSettingsUpdate).string(), com.ringcentral.definitions.CallerBlockingSettings::class.java)
        // return await rc.Put<com.ringcentral.definitions.CallerBlockingSettings>(this.path(), callerBlockingSettingsUpdate);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.callerblocking(): Index {
        return Index(this)
    }
}
