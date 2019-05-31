package com.ringcentral.paths.restapi.account.phonenumber

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val phoneNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && phoneNumberId != null) {
            return "${parent.path()}/phone-number/${phoneNumberId}"
        }

        return "${parent.path()}/phone-number"
    }

    /**
     * Operation: Get Company Phone Number List
     * Http Get /restapi/v1.0/account/{accountId}/phone-number
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListAccountPhoneNumbersParameters? = null): com.ringcentral.definitions.AccountPhoneNumbers {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.AccountPhoneNumbers::class.java)
    }

    /**
     * Operation: Get Phone Number
     * Http Get /restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId}
     */
    fun get(): com.ringcentral.definitions.CompanyPhoneNumberInfo {
        if (this.phoneNumberId == null) {
            throw NullPointerException("phoneNumberId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CompanyPhoneNumberInfo::class.java)
    }
}
