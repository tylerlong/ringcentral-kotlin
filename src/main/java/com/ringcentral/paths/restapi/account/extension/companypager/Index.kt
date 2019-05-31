package com.ringcentral.paths.restapi.account.extension.companypager

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/company-pager"
    }

    /// <summary>
    /// Operation: Create Internal Text Message
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager
    /// </summary>
    fun post(createInternalTextMessageRequest: com.ringcentral.definitions.CreateInternalTextMessageRequest): com.ringcentral.definitions.GetMessageInfoResponse
    // public async Task<com.ringcentral.definitions.GetMessageInfoResponse> Post(createInternalTextMessageRequest: com.ringcentral.definitions.CreateInternalTextMessageRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), createInternalTextMessageRequest).string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.GetMessageInfoResponse>(this.path(), createInternalTextMessageRequest);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.companypager(): Index {
        return Index(this)
    }
}
