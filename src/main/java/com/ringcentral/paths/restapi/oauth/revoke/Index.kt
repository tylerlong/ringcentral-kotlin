package com.ringcentral.paths.restapi.oauth.revoke

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/revoke"
    }

    /**
     * Operation: Revoke Token
     * Http Post /restapi/oauth/revoke
     */
    fun post(revokeTokenRequest: com.ringcentral.definitions.RevokeTokenRequest): String? {
        val str: String? = rc.post(this.path(), revokeTokenRequest, null, com.ringcentral.ContentType.FORM).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
