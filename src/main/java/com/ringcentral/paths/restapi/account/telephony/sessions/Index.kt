package com.ringcentral.paths.restapi.account.telephony.sessions

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.Index, val sessionId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && sessionId != null) {
            return "${parent.path()}/sessions/${sessionId}"
        }

        return "${parent.path()}/sessions"
    }

    /**
     * Operation: Get Call Session Status
     * Http Get /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadCallSessionStatusParameters? = null): com.ringcentral.definitions.CallSessionObject {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.CallSessionObject::class.java)
    }

    /**
     * Operation: Drop Call Session
     * Http Delete /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}
     */
    fun delete(): String {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }


    @JvmOverloads
    fun parties(partyId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index(this, partyId)
    }


    fun supervise(): com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index(this)
    }

}