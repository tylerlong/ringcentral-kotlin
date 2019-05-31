package com.ringcentral.paths.restapi.account.extension.callerid

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/caller-id"
    }

    /**
     * Operation: Get Extension Caller ID
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id
     */
    fun get(): com.ringcentral.definitions.ExtensionCallerIdInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.ExtensionCallerIdInfo::class.java)
    }

    /**
     * Operation: Update Extension Caller ID
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-id
     */
    fun put(extensionCallerIdInfo: com.ringcentral.definitions.ExtensionCallerIdInfo): com.ringcentral.definitions.ExtensionCallerIdInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), extensionCallerIdInfo).string(), com.ringcentral.definitions.ExtensionCallerIdInfo::class.java)
    }
}
