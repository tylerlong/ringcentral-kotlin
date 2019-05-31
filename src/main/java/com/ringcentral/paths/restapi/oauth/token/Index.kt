package com.ringcentral.paths.restapi.oauth.token

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/token"
    }

    /**
     * Operation: Get Token
     * Http Post /restapi/oauth/token
     */
    fun post(getTokenRequest: com.ringcentral.definitions.GetTokenRequest): com.ringcentral.definitions.TokenInfo? {
        val str: String? = rc.post(this.path(), getTokenRequest, null, com.ringcentral.ContentType.FORM).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.TokenInfo::class.java)
    }

}
