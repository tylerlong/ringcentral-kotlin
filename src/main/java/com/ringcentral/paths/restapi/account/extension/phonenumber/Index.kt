package com.ringcentral.paths.restapi.account.extension.phonenumber

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/phone-number"
    }

    /**
     * Operation: Get Extension Phone Number List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListExtensionPhoneNumbersParameters? = null): com.ringcentral.definitions.GetExtensionPhoneNumbersResponse? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetExtensionPhoneNumbersResponse::class.java)
    }

}
