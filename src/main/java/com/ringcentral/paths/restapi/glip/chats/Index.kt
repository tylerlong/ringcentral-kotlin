package com.ringcentral.paths.restapi.glip.chats

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/chats/${chatId}"
        }

        return "${parent.path()}/chats"
    }

    /// <summary>
    /// Operation: Get Chats
    /// Http Get /restapi/v1.0/glip/chats
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListGlipChatsParameters? = null): com.ringcentral.definitions.GlipChatsList
    // public async Task<com.ringcentral.definitions.GlipChatsList> List(queryParams: com.ringcentral.definitions.ListGlipChatsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipChatsList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipChatsList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Chat
    /// Http Get /restapi/v1.0/glip/chats/{chatId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipChatInfo
    // public async Task<com.ringcentral.definitions.GlipChatInfo> Get()
    {
        if (this.chatId == null) {
            throw NullPointerException("chatId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipChatInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipChatInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.chats(chatId: String? = null): Index {
        return Index(this, chatId)
    }
}
