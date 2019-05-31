package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.assistants

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meetingsconfiguration.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/assistants"
    }

    /**
     * Operation: Get Assistants
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meetings-configuration/assistants
     */
    fun get(): com.ringcentral.definitions.AssistantsResource? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AssistantsResource::class.java)
    }

}
