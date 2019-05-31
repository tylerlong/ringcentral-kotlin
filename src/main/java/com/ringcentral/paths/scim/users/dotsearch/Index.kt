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
    fun post(searchRequest: com.ringcentral.definitions.SearchRequest): com.ringcentral.definitions.UserSearchResponse? {
        val str: String? = rc.post(this.path(), searchRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.UserSearchResponse::class.java)
    }

}
