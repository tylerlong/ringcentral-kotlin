package com.ringcentral.paths.restapi.account.phonenumber

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val phoneNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && phoneNumberId != null) {
            return "${parent.path()}/phone-number/${phoneNumberId}"
        }

        return "${parent.path()}/phone-number"
    }

    /// <summary>
    /// Operation: Get Company Phone Number List
    /// Http Get /restapi/v1.0/account/{accountId}/phone-number
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListAccountPhoneNumbersParameters? = null): com.ringcentral.definitions.AccountPhoneNumbers
    // public async Task<com.ringcentral.definitions.AccountPhoneNumbers> List(queryParams: com.ringcentral.definitions.ListAccountPhoneNumbersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.AccountPhoneNumbers::class.java)
        // return await rc.Get<com.ringcentral.definitions.AccountPhoneNumbers>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Phone Number
    /// Http Get /restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId}
    /// </summary>
    fun get(): com.ringcentral.definitions.CompanyPhoneNumberInfo
    // public async Task<com.ringcentral.definitions.CompanyPhoneNumberInfo> Get()
    {
        if (this.phoneNumberId == null) {
            throw NullPointerException("phoneNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CompanyPhoneNumberInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.CompanyPhoneNumberInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.phonenumber(phoneNumberId: String? = null): Index {
        return Index(this, phoneNumberId)
    }
}
