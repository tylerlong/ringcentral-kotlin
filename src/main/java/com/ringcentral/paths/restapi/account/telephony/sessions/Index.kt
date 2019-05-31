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
    fun get(queryParams: com.ringcentral.definitions.ReadCallSessionStatusParameters? = null): com.ringcentral.definitions.CallSessionObject? {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId")
        }

        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallSessionObject::class.java)
    }


    /**
     * Operation: Drop Call Session
     * Http Delete /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}
     */
    fun delete(): String? {
        if (this.sessionId == null) {
            throw NullPointerException("sessionId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    @JvmOverloads
    fun parties(partyId: String? = null): com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index(this, partyId)
    }


    fun supervise(): com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index {
        return com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index(this)
    }

}