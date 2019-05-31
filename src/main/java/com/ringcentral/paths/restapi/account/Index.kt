package com.ringcentral.paths.restapi.account

class Index(val parent: com.ringcentral.paths.restapi.Index, val accountId: String? = "~") {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && accountId != null) {
            return "${parent.path()}/account/${accountId}"
        }

        return "${parent.path()}/account"
    }

    /// <summary>
    /// Operation: Get Account Info
    /// Http Get /restapi/v1.0/account/{accountId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetAccountInfoResponse
    // public async Task<com.ringcentral.definitions.GetAccountInfoResponse> Get()
    {
        if (this.accountId == null) {
            throw NullPointerException("accountId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetAccountInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetAccountInfoResponse>(this.path());
    }

    fun com.ringcentral.paths.restapi.Index.account(accountId: String? = "~"): Index {
        return Index(this, accountId)
    }
}
