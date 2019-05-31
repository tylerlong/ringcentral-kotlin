package com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/flip"
    }

    /// <summary>
    /// Operation: Call Flip on Party
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/flip
    /// </summary>
    fun post(callPartyFlip: com.ringcentral.definitions.CallPartyFlip): String
    // public async Task<String> Post(callPartyFlip: com.ringcentral.definitions.CallPartyFlip)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), callPartyFlip).string(), String::class.java)
        // return await rc.Post<String>(this.path(), callPartyFlip);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index.flip(): Index {
        return Index(this)
    }
}
