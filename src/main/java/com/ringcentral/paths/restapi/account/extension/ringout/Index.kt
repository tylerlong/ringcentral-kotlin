package com.ringcentral.paths.restapi.account.extension.ringout

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val ringoutId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ringoutId != null) {
            return "${parent.path()}/ring-out/${ringoutId}"
        }

        return "${parent.path()}/ring-out"
    }

    /**
     * Operation: Make RingOut Call
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out
     */
    fun post(makeRingOutRequest: com.ringcentral.definitions.MakeRingOutRequest): com.ringcentral.definitions.GetRingOutStatusResponse? {
        val str: String? = rc.post(this.path(false), makeRingOutRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetRingOutStatusResponse::class.java)
    }


    /**
     * Operation: Get RingOut Call Status
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
     */
    fun get(): com.ringcentral.definitions.GetRingOutStatusResponse? {
        if (this.ringoutId == null) {
            throw NullPointerException("ringoutId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetRingOutStatusResponse::class.java)
    }


    /**
     * Operation: Cancel RingOut Call
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
     */
    fun delete(): String? {
        if (this.ringoutId == null) {
            throw NullPointerException("ringoutId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
