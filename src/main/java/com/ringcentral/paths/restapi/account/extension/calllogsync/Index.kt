package com.ringcentral.paths.restapi.account.extension.calllogsync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/call-log-sync"
    }

    /// <summary>
    /// Operation: Sync User Call Log
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.SyncUserCallLogParameters? = null): com.ringcentral.definitions.CallLogSync
    // public async Task<com.ringcentral.definitions.CallLogSync> Get(queryParams: com.ringcentral.definitions.SyncUserCallLogParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.CallLogSync::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallLogSync>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.calllogsync(): Index {
        return Index(this)
    }
}
