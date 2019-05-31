package com.ringcentral.paths.scim.users.dotsearch

class Index(val parent: com.ringcentral.paths.scim.users.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/.search"
    }

    /// <summary>
    /// Operation: Search or List Users
    /// Http Post /scim/v2/Users/.search
    /// </summary>
    fun post(searchRequest: com.ringcentral.definitions.SearchRequest): com.ringcentral.definitions.UserSearchResponse
    // public async Task<com.ringcentral.definitions.UserSearchResponse> Post(searchRequest: com.ringcentral.definitions.SearchRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), searchRequest).string(), com.ringcentral.definitions.UserSearchResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.UserSearchResponse>(this.path(), searchRequest);
    }

    fun com.ringcentral.paths.scim.users.Index.dotsearch(): Index {
        return Index(this)
    }
}
