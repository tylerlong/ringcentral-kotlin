package com.ringcentral.paths.restapi.account.extension.messagestore

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val messageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && messageId != null) {
            return "${parent.path()}/message-store/${messageId}"
        }

        return "${parent.path()}/message-store"
    }

    /**
     * Operation: Get Message List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListMessagesParameters? = null): com.ringcentral.definitions.GetMessageList? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetMessageList::class.java)
    }


    /**
     * Operation: Get Message
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    fun get(): com.ringcentral.definitions.GetMessageInfoResponse? {
        if (this.messageId == null) {
            throw NullPointerException("messageId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetMessageInfoResponse::class.java)
    }


    /**
     * Operation: Update Message(s)
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    fun put(updateMessageRequest: com.ringcentral.definitions.UpdateMessageRequest): com.ringcentral.definitions.GetMessageInfoResponse? {
        if (this.messageId == null) {
            throw NullPointerException("messageId")
        }

        val str: String? = rc.put(this.path(), updateMessageRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetMessageInfoResponse::class.java)
    }


    /**
     * Operation: Delete Message
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}
     */
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteMessageParameters? = null): String? {
        if (this.messageId == null) {
            throw NullPointerException("messageId")
        }

        val str: String? = rc.delete(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    @JvmOverloads
    fun content(attachmentId: String? = null): com.ringcentral.paths.restapi.account.extension.messagestore.content.Index {
        return com.ringcentral.paths.restapi.account.extension.messagestore.content.Index(this, attachmentId)
    }

}