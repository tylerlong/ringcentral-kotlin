package com.ringcentral.paths.restapi.account.telephony.sessions

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index, val sessionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && sessionId != null) {
            return "${parent.path()}/sessions/${sessionId}"
        }

        return "${parent.path()}/sessions"
    }

    /// <summary>
    /// Operation: Get Call Session Status
    /// Http Get /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadCallSessionStatusParameters? = null): com.ringcentral.definitions.CallSessionObject
    // public async Task<com.ringcentral.definitions.CallSessionObject> Get(queryParams: com.ringcentral.definitions.ReadCallSessionStatusParameters? = null)
    {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.CallSessionObject::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallSessionObject>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Drop Call Session
    /// Http Delete /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.telephony.Index.sessions(sessionId: String? = null): Index {
        return Index(this, sessionId)
    }
}
