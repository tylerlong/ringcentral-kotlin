package com.ringcentral.paths.restapi.glip.chats.unfavorite

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unfavorite"
    }

    /**
     * Operation: Remove Chat from Favorites
     * Http Post /restapi/v1.0/glip/chats/{chatId}/unfavorite
     */
    fun post(): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
    }
}
