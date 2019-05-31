package com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/forward"
    }

    /**
     * Operation: Forward Call Party
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/forward
     */
    fun post(forwardTarget: com.ringcentral.definitions.ForwardTarget): com.ringcentral.definitions.CallParty? {
        val str: String? = rc.post(this.path(), forwardTarget).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallParty::class.java)
    }

}
