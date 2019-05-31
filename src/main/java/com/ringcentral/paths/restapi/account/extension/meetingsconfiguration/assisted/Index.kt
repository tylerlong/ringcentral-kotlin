package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assisted

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/assisted"
    }

    /**
     * Operation: Get Assisted Users
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assisted
     */
    fun get(): com.ringcentral.definitions.AssistedUsersResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AssistedUsersResource::class.java)
    }
}
