package com.ringcentral.paths.restapi.dictionary.state

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val stateId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && stateId != null) {
            return "${parent.path()}/state/${stateId}"
        }

        return "${parent.path()}/state"
    }

    /// <summary>
    /// Operation: Get States List
    /// Http Get /restapi/v1.0/dictionary/state
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListStatesParameters? = null): com.ringcentral.definitions.GetStateListResponse
    // public async Task<com.ringcentral.definitions.GetStateListResponse> List(queryParams: com.ringcentral.definitions.ListStatesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetStateListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetStateListResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get State
    /// Http Get /restapi/v1.0/dictionary/state/{stateId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetStateInfoResponse
    // public async Task<com.ringcentral.definitions.GetStateInfoResponse> Get()
    {
        if (this.stateId == null) {
            throw NullPointerException("stateId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetStateInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetStateInfoResponse>(this.path());
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.state(stateId: String? = null): Index {
        return Index(this, stateId)
    }
}
