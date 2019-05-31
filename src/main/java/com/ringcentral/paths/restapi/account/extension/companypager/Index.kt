package com.ringcentral.paths.restapi.account.extension.companypager

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/company-pager"
    }

    /**
     * Operation: Create Internal Text Message
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager
     */
    fun post(createInternalTextMessageRequest: com.ringcentral.definitions.CreateInternalTextMessageRequest): com.ringcentral.definitions.GetMessageInfoResponse? {
        val str: String? = rc.post(this.path(), createInternalTextMessageRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetMessageInfoResponse::class.java)
    }

}
