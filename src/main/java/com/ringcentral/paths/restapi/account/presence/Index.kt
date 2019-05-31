package com.ringcentral.paths.restapi.account.presence

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/presence"
    }

    /**
     * Operation: Get User Presence Status List
     * Http Get /restapi/v1.0/account/{accountId}/presence
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadAccountPresenceParameters? = null): com.ringcentral.definitions.AccountPresenceInfo? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AccountPresenceInfo::class.java)
    }

}
