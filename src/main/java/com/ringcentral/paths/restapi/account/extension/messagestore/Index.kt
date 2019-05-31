package com.ringcentral.paths.restapi.account.extension.messagestore

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val messageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && messageId != null) {
            return "${parent.path()}/message-store/${messageId}"
        }

        return "${parent.path()}/message-store"
    }

    /// <summary>
    /// Operation: Get Message List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListMessagesParameters? = null): com.ringcentral.definitions.GetMessageList
    // public async Task<com.ringcentral.definitions.GetMessageList> List(queryParams: com.ringcentral.definitions.ListMessagesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetMessageList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetMessageList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Message
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetMessageInfoResponse
    // public async Task<com.ringcentral.definitions.GetMessageInfoResponse> Get()
    {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetMessageInfoResponse>(this.path());
    }

    /// <summary>
    /// Operation: Update Message(s)
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
    /// </summary>
    fun put(updateMessageRequest: com.ringcentral.definitions.UpdateMessageRequest): com.ringcentral.definitions.GetMessageInfoResponse
    // public async Task<com.ringcentral.definitions.GetMessageInfoResponse> Put(updateMessageRequest: com.ringcentral.definitions.UpdateMessageRequest)
    {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), updateMessageRequest).string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
        // return await rc.Put<com.ringcentral.definitions.GetMessageInfoResponse>(this.path(), updateMessageRequest);
    }

    /// <summary>
    /// Operation: Delete Message
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
    /// </summary>
    fun delete(queryParams: com.ringcentral.definitions.DeleteMessageParameters? = null): String
    // public async Task<String> Delete(queryParams: com.ringcentral.definitions.DeleteMessageParameters? = null)
    {
        if (this.messageId == null) {
            throw NullPointerException("messageId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path(), queryParams).string(), String::class.java)
        // return await rc.Delete<String>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.messagestore(messageId: String? = null): Index {
        return Index(this, messageId)
    }
}
