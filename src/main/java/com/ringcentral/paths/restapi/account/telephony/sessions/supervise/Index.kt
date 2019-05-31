package com.ringcentral.paths.restapi.account.telephony.sessions.supervise

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/supervise"
    }

    /// <summary>
    /// Operation: Supervise Call
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/supervise
    /// </summary>
    fun post(superviseCallSessionRequest: com.ringcentral.definitions.SuperviseCallSessionRequest): com.ringcentral.definitions.SuperviseCallSession
    // public async Task<com.ringcentral.definitions.SuperviseCallSession> Post(superviseCallSessionRequest: com.ringcentral.definitions.SuperviseCallSessionRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), superviseCallSessionRequest).string(), com.ringcentral.definitions.SuperviseCallSession::class.java)
        // return await rc.Post<com.ringcentral.definitions.SuperviseCallSession>(this.path(), superviseCallSessionRequest);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.Index.supervise(): Index {
        return Index(this)
    }
}
