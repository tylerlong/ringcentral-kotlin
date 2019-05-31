package com.ringcentral.paths.restapi.account.extension.messagesync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/message-sync"
    }

    /// <summary>
    /// Operation: Sync Messages
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.SyncMessagesParameters? = null): com.ringcentral.definitions.GetMessageSyncResponse
    // public async Task<com.ringcentral.definitions.GetMessageSyncResponse> Get(queryParams: com.ringcentral.definitions.SyncMessagesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetMessageSyncResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetMessageSyncResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.messagesync(): Index {
        return Index(this)
    }
}
