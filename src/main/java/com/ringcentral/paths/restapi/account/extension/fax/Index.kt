package com.ringcentral.paths.restapi.account.extension.fax

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/fax"
    }

    /// <summary>
    /// Operation: Create Fax Message
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/fax
    /// </summary>
    fun post(createFaxMessageRequest: com.ringcentral.definitions.CreateFaxMessageRequest): com.ringcentral.definitions.FaxResponse
    // public async Task<com.ringcentral.definitions.FaxResponse> Post(createFaxMessageRequest: com.ringcentral.definitions.CreateFaxMessageRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), createFaxMessageRequest, com.ringcentral.ContentType.MULTIPART).string(), com.ringcentral.definitions.FaxResponse::class.java)
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.fax(): Index {
        return Index(this)
    }
}
