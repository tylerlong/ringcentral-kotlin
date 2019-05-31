package com.ringcentral.paths.restapi.account.extension.favorite

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/favorite"
    }

    /// <summary>
    /// Operation: Get Favorite Contact List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
    /// </summary>
    fun get(): String
    // public async Task<String> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
        // return await rc.Get<String>(this.path());
    }

    /// <summary>
    /// Operation: Update Favorite Contact List
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/favorite
    /// </summary>
    fun put(favoriteCollection: com.ringcentral.definitions.FavoriteCollection): String
    // public async Task<String> Put(favoriteCollection: com.ringcentral.definitions.FavoriteCollection)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), favoriteCollection).string(), String::class.java)
        // return await rc.Put<String>(this.path(), favoriteCollection);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.favorite(): Index {
        return Index(this)
    }
}
