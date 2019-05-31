package com.ringcentral.paths.restapi.glip.favorites

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/favorites"
    }

    /// <summary>
    /// Operation: Get Favorite Chats
    /// Http Get /restapi/v1.0/glip/favorites
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListFavoriteChatsParameters? = null): com.ringcentral.definitions.GlipChatsListWithoutNavigation
    // public async Task<com.ringcentral.definitions.GlipChatsListWithoutNavigation> Get(queryParams: com.ringcentral.definitions.ListFavoriteChatsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GlipChatsListWithoutNavigation::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipChatsListWithoutNavigation>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.glip.Index.favorites(): Index {
        return Index(this)
    }
}
