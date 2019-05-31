package com.ringcentral.paths.restapi.account.extension.activecalls

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/active-calls"
    }

    /**
     * Operation: Get User Active Calls
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListExtensionActiveCallsParameters? = null): com.ringcentral.definitions.ActiveCallsResponse? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.ActiveCallsResponse::class.java)
    }

}
