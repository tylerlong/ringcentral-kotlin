package com.ringcentral.paths.restapi.glip.conversations

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/conversations/${chatId}"
        }

        return "${parent.path()}/conversations"
    }

    /// <summary>
    /// Operation: Get Conversations
    /// Http Get /restapi/v1.0/glip/conversations
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListGlipConversationsParameters? = null): com.ringcentral.definitions.GlipConversationsList
    // public async Task<com.ringcentral.definitions.GlipConversationsList> List(queryParams: com.ringcentral.definitions.ListGlipConversationsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipConversationsList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipConversationsList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create/Open Conversation
    /// Http Post /restapi/v1.0/glip/conversations
    /// </summary>
    fun post(createGlipConversationRequest: com.ringcentral.definitions.CreateGlipConversationRequest): com.ringcentral.definitions.GlipConversationInfo
    // public async Task<com.ringcentral.definitions.GlipConversationInfo> Post(createGlipConversationRequest: com.ringcentral.definitions.CreateGlipConversationRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createGlipConversationRequest).string(), com.ringcentral.definitions.GlipConversationInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipConversationInfo>(this.path(false), createGlipConversationRequest);
    }

    /// <summary>
    /// Operation: Get Conversation
    /// Http Get /restapi/v1.0/glip/conversations/{chatId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipConversationInfo
    // public async Task<com.ringcentral.definitions.GlipConversationInfo> Get()
    {
        if (this.chatId == null) {
            throw NullPointerException("chatId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipConversationInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipConversationInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.conversations(chatId: String? = null): Index {
        return Index(this, chatId)
    }
}
