package com.ringcentral.paths.restapi.account.telephony.sessions.parties

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.Index, val partyId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && partyId != null) {
            return "${parent.path()}/parties/${partyId}"
        }

        return "${parent.path()}/parties"
    }

    /// <summary>
    /// Operation: Get Call Party Status
    /// Http Get /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}
    /// </summary>
    fun get(): com.ringcentral.definitions.CallParty
    // public async Task<com.ringcentral.definitions.CallParty> Get()
    {
        if (this.partyId == null) {
            throw NullPointerException("partyId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CallParty::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallParty>(this.path());
    }

    /// <summary>
    /// Operation: Update Call Party
    /// Http Patch /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}
    /// </summary>
    fun patch(partyUpdateRequest: com.ringcentral.definitions.PartyUpdateRequest): com.ringcentral.definitions.CallParty
    // public async Task<com.ringcentral.definitions.CallParty> Patch(partyUpdateRequest: com.ringcentral.definitions.PartyUpdateRequest)
    {
        if (this.partyId == null) {
            throw NullPointerException("partyId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), partyUpdateRequest).string(), com.ringcentral.definitions.CallParty::class.java)
        // return await rc.Patch<com.ringcentral.definitions.CallParty>(this.path(), partyUpdateRequest);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.Index.parties(partyId: String? = null): Index {
        return Index(this, partyId)
    }
}
