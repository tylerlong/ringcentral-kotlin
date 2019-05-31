package com.ringcentral.paths.restapi.account.extension.meeting.end

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/end"
    }

    /**
     * Operation: End Meeting
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end
     */
    fun post(): String? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
