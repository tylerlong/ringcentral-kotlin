package com.ringcentral.paths.restapi.oauth.token

class Index(val parent: com.ringcentral.paths.restapi.oauth.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/token"
    }

    /// <summary>
    /// Operation: Get Token
    /// Http Post /restapi/oauth/token
    /// </summary>
    fun post(getTokenRequest: com.ringcentral.definitions.GetTokenRequest): com.ringcentral.definitions.TokenInfo
    // public async Task<com.ringcentral.definitions.TokenInfo> Post(getTokenRequest: com.ringcentral.definitions.GetTokenRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), getTokenRequest, com.ringcentral.ContentType.FORM).string(), com.ringcentral.definitions.TokenInfo::class.java)
    }

    fun com.ringcentral.paths.restapi.oauth.Index.token(): Index {
        return Index(this)
    }
}
