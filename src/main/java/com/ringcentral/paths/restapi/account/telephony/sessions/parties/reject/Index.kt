package com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/reject"
    }

    /**
     * Operation: Reject Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/reject
     */
    fun post(): String? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
