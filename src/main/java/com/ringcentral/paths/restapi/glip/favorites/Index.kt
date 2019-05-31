package com.ringcentral.paths.restapi.glip.favorites

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/favorites"
    }

    /**
     * Operation: Get Favorite Chats
     * Http Get /restapi/v1.0/glip/favorites
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListFavoriteChatsParameters? = null): com.ringcentral.definitions.GlipChatsListWithoutNavigation {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GlipChatsListWithoutNavigation::class.java)
    }
}
