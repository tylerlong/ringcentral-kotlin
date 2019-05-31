package com.ringcentral.paths.restapi.account.extension.device

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/device"
    }

    /**
     * Operation: Get Extension Device List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/device
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListExtensionDevicesParameters? = null): com.ringcentral.definitions.GetExtensionDevicesResponse {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetExtensionDevicesResponse::class.java)
    }
}
