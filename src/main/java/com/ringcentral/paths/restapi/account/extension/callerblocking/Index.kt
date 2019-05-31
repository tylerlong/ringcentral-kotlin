package com.ringcentral.paths.restapi.account.extension.callerblocking

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/caller-blocking"
    }

    /**
     * Operation: Get Caller Blocking Settings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking
     */
    fun get(): com.ringcentral.definitions.CallerBlockingSettings {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CallerBlockingSettings::class.java)
    }

    /**
     * Operation: Update Caller Blocking Settings
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking
     */
    fun put(callerBlockingSettingsUpdate: com.ringcentral.definitions.CallerBlockingSettingsUpdate): com.ringcentral.definitions.CallerBlockingSettings {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), callerBlockingSettingsUpdate).string(), com.ringcentral.definitions.CallerBlockingSettings::class.java)
    }


    @JvmOverloads
    fun phonenumbers(blockedNumberId: String? = null): com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers.Index {
        return com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers.Index(this, blockedNumberId)
    }

}