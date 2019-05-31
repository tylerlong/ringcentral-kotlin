package com.ringcentral.paths.restapi.account.extension.favorite

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/favorite"
    }

    /**
     * Operation: Get Favorite Contact List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
     */
    fun get(): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
    }

    /**
     * Operation: Update Favorite Contact List
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
     */
    fun put(favoriteCollection: com.ringcentral.definitions.FavoriteCollection): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), favoriteCollection).string(), String::class.java)
    }
}
