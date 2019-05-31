package com.ringcentral.paths.restapi.account.extension.grant

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/grant"
    }

    /**
     * Operation: Get Extension Grant List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/grant
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListExtensionGrantsParameters? = null): com.ringcentral.definitions.GetExtensionGrantListResponse? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetExtensionGrantListResponse::class.java)
    }

}
