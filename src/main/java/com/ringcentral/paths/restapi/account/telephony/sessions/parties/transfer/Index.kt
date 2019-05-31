package com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/transfer"
    }

    /// <summary>
    /// Operation: Transfer Call Party
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/transfer
    /// </summary>
    fun post(transferTarget: com.ringcentral.definitions.TransferTarget): com.ringcentral.definitions.CallParty
    // public async Task<com.ringcentral.definitions.CallParty> Post(transferTarget: com.ringcentral.definitions.TransferTarget)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), transferTarget).string(), com.ringcentral.definitions.CallParty::class.java)
        // return await rc.Post<com.ringcentral.definitions.CallParty>(this.path(), transferTarget);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index.transfer(): Index {
        return Index(this)
    }
}
