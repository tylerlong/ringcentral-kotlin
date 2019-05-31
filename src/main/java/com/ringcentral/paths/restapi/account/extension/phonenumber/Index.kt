package com.ringcentral.paths.restapi.account.extension.phonenumber

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/phone-number"
    }

    /// <summary>
    /// Operation: Get Extension Phone Number List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListExtensionPhoneNumbersParameters? = null): com.ringcentral.definitions.GetExtensionPhoneNumbersResponse
    // public async Task<com.ringcentral.definitions.GetExtensionPhoneNumbersResponse> Get(queryParams: com.ringcentral.definitions.ListExtensionPhoneNumbersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetExtensionPhoneNumbersResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionPhoneNumbersResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.phonenumber(): Index {
        return Index(this)
    }
}
