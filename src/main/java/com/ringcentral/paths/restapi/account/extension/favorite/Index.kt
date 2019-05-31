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
    fun get(): String? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    /**
     * Operation: Update Favorite Contact List
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
     */
    fun put(favoriteCollection: com.ringcentral.definitions.FavoriteCollection): String? {
        val str: String? = rc.put(this.path(), favoriteCollection).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
