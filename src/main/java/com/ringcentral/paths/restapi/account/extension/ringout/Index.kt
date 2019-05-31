package com.ringcentral.paths.restapi.account.extension.ringout

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val ringoutId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ringoutId != null) {
            return "${parent.path()}/ring-out/${ringoutId}"
        }

        return "${parent.path()}/ring-out"
    }

    /// <summary>
    /// Operation: Make RingOut Call
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out
    /// </summary>
    fun post(makeRingOutRequest: com.ringcentral.definitions.MakeRingOutRequest): com.ringcentral.definitions.GetRingOutStatusResponse
    // public async Task<com.ringcentral.definitions.GetRingOutStatusResponse> Post(makeRingOutRequest: com.ringcentral.definitions.MakeRingOutRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), makeRingOutRequest).string(), com.ringcentral.definitions.GetRingOutStatusResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.GetRingOutStatusResponse>(this.path(false), makeRingOutRequest);
    }

    /// <summary>
    /// Operation: Get RingOut Call Status
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetRingOutStatusResponse
    // public async Task<com.ringcentral.definitions.GetRingOutStatusResponse> Get()
    {
        if (this.ringoutId == null) {
            throw NullPointerException("ringoutId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetRingOutStatusResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetRingOutStatusResponse>(this.path());
    }

    /// <summary>
    /// Operation: Cancel RingOut Call
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/ring-out/{ringoutId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.ringoutId == null) {
            throw NullPointerException("ringoutId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.ringout(ringoutId: String? = null): Index {
        return Index(this, ringoutId)
    }
}
