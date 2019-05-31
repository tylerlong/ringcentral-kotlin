package com.ringcentral.paths.restapi.account.extension.presence

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/presence"
    }

    /**
     * Operation: Get User Presence Status
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadUserPresenceStatusParameters? = null): com.ringcentral.definitions.GetPresenceInfo? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetPresenceInfo::class.java)
    }


    /**
     * Operation: Update User Presence Status
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence
     */
    fun put(presenceInfoResource: com.ringcentral.definitions.PresenceInfoResource): com.ringcentral.definitions.PresenceInfoResource? {
        val str: String? = rc.put(this.path(), presenceInfoResource).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.PresenceInfoResource::class.java)
    }

}
