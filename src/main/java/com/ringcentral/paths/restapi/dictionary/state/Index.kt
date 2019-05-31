package com.ringcentral.paths.restapi.dictionary.state

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val stateId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && stateId != null) {
            return "${parent.path()}/state/${stateId}"
        }

        return "${parent.path()}/state"
    }

    /**
     * Operation: Get States List
     * Http Get /restapi/v1.0/dictionary/state
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListStatesParameters? = null): com.ringcentral.definitions.GetStateListResponse? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetStateListResponse::class.java)
    }


    /**
     * Operation: Get State
     * Http Get /restapi/v1.0/dictionary/state/{stateId}
     */
    fun get(): com.ringcentral.definitions.GetStateInfoResponse? {
        if (this.stateId == null) {
            throw NullPointerException("stateId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetStateInfoResponse::class.java)
    }

}
