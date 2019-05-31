package com.ringcentral.paths.restapi.account.extension.messagesync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/message-sync"
    }

    /**
     * Operation: Sync Messages
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.SyncMessagesParameters? = null): com.ringcentral.definitions.GetMessageSyncResponse {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetMessageSyncResponse::class.java)
    }
}
