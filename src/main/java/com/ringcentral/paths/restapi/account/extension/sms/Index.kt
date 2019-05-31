package com.ringcentral.paths.restapi.account.extension.sms

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/sms"
    }

    /// <summary>
    /// Operation: Create SMS/MMS Message
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/sms
    /// </summary>
    fun post(createSMSMessage: com.ringcentral.definitions.CreateSMSMessage): com.ringcentral.definitions.GetMessageInfoResponse
    // public async Task<com.ringcentral.definitions.GetMessageInfoResponse> Post(createSMSMessage: com.ringcentral.definitions.CreateSMSMessage)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), createSMSMessage).string(), com.ringcentral.definitions.GetMessageInfoResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.GetMessageInfoResponse>(this.path(), createSMSMessage);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.sms(): Index {
        return Index(this)
    }
}
