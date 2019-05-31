package com.ringcentral.paths.restapi.account.extension.messagestore.content

class Index(val parent: com.ringcentral.paths.restapi.account.extension.messagestore.Index, val attachmentId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && attachmentId != null) {
            return "${parent.path()}/content/${attachmentId}"
        }

        return "${parent.path()}/content"
    }

    /// <summary>
    /// Operation: Get Message Content
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadMessageContentParameters? = null): ByteArray
    // public async Task<ByteArray> Get(queryParams: com.ringcentral.definitions.ReadMessageContentParameters? = null)
    {
        if (this.attachmentId == null) {
            throw NullPointerException("attachmentId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), ByteArray::class.java)
        // return await rc.Get<ByteArray>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.messagestore.Index.content(attachmentId: String? = null): Index {
        return Index(this, attachmentId)
    }
}
