package com.ringcentral.paths.restapi.account.telephony.callout

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-out"
    }

    /**
     * Operation: Create CallOut Call Session
     * Http Post /restapi/v1.0/account/{accountId}/telephony/call-out
     */
    fun post(makeCallOutRequest: com.ringcentral.definitions.MakeCallOutRequest): com.ringcentral.definitions.CallSession? {
        val str: String? = rc.post(this.path(), makeCallOutRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallSession::class.java)
    }

}
