package com.ringcentral.paths.scim.users.dotsearch

class Index(val parent: com.ringcentral.paths.scim.users.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/.search"
    }

    /**
     * Operation: Search or List Users
     * Http Post /scim/v2/Users/.search
     */
    fun post(searchRequest: com.ringcentral.definitions.SearchRequest): com.ringcentral.definitions.UserSearchResponse {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), searchRequest).string(), com.ringcentral.definitions.UserSearchResponse::class.java)
    }
}
