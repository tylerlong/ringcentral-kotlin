package com.ringcentral.paths.restapi.glip.recent.chats

class Index(val parent: com.ringcentral.paths.restapi.glip.recent.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/chats"
    }

    /// <summary>
    /// Operation: Get Recent Chats
    /// Http Get /restapi/v1.0/glip/recent/chats
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListRecentChatsParameters? = null): com.ringcentral.definitions.GlipChatsListWithoutNavigation
    // public async Task<com.ringcentral.definitions.GlipChatsListWithoutNavigation> Get(queryParams: com.ringcentral.definitions.ListRecentChatsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GlipChatsListWithoutNavigation::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipChatsListWithoutNavigation>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.glip.recent.Index.chats(): Index {
        return Index(this)
    }
}
