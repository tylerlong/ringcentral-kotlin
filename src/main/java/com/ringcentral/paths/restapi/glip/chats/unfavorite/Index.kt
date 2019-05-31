package com.ringcentral.paths.restapi.glip.chats.unfavorite

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unfavorite"
    }

    /// <summary>
    /// Operation: Remove Chat from Favorites
    /// Http Post /restapi/v1.0/glip/chats/{chatId}/unfavorite
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.chats.Index.unfavorite(): Index {
        return Index(this)
    }
}