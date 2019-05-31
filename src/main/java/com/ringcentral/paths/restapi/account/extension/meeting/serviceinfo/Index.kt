package com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/service-info"
    }

    /**
     * Operation: Get Meeting Service Info
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info
     */
    fun get(): com.ringcentral.definitions.MeetingServiceInfoResource? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MeetingServiceInfoResource::class.java)
    }

}
