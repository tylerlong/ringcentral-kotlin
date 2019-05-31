package com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unhold"
    }

    /// <summary>
    /// Operation: Unhold Call Party
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/unhold
    /// </summary>
    fun post(): com.ringcentral.definitions.CallParty
    // public async Task<com.ringcentral.definitions.CallParty> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), com.ringcentral.definitions.CallParty::class.java)
        // return await rc.Post<com.ringcentral.definitions.CallParty>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index.unhold(): Index {
        return Index(this)
    }
}
