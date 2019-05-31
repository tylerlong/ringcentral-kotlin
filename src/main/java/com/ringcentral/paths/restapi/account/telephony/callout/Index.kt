package com.ringcentral.paths.restapi.account.telephony.callout

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-out"
    }

    /// <summary>
    /// Operation: Create CallOut Call Session
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/call-out
    /// </summary>
    fun post(makeCallOutRequest: com.ringcentral.definitions.MakeCallOutRequest): com.ringcentral.definitions.CallSession
    // public async Task<com.ringcentral.definitions.CallSession> Post(makeCallOutRequest: com.ringcentral.definitions.MakeCallOutRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), makeCallOutRequest).string(), com.ringcentral.definitions.CallSession::class.java)
        // return await rc.Post<com.ringcentral.definitions.CallSession>(this.path(), makeCallOutRequest);
    }

    fun com.ringcentral.paths.restapi.account.telephony.Index.callout(): Index {
        return Index(this)
    }
}
