package com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/forward"
    }

    /// <summary>
    /// Operation: Forward Call Party
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/forward
    /// </summary>
    fun post(forwardTarget: com.ringcentral.definitions.ForwardTarget): com.ringcentral.definitions.CallParty
    // public async Task<com.ringcentral.definitions.CallParty> Post(forwardTarget: com.ringcentral.definitions.ForwardTarget)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), forwardTarget).string(), com.ringcentral.definitions.CallParty::class.java)
        // return await rc.Post<com.ringcentral.definitions.CallParty>(this.path(), forwardTarget);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index.forward(): Index {
        return Index(this)
    }
}
