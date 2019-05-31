package com.ringcentral.paths.restapi.oauth.revoke

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/revoke"
    }

    /// <summary>
    /// Operation: Revoke Token
    /// Http Post /restapi/oauth/revoke
    /// </summary>
    fun post(revokeTokenRequest: com.ringcentral.definitions.RevokeTokenRequest): String
    // public async Task<String> Post(revokeTokenRequest: com.ringcentral.definitions.RevokeTokenRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), revokeTokenRequest, com.ringcentral.ContentType.FORM).string(), String::class.java)
    }

    fun com.ringcentral.paths.restapi.oauth.Index.revoke(): Index {
        return Index(this)
    }
}
