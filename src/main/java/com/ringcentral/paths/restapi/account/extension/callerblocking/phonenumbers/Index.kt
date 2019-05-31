package com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers

class Index(val parent: com.ringcentral.paths.restapi.account.extension.callerblocking.Index, val blockedNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && blockedNumberId != null) {
            return "${parent.path()}/phone-numbers/${blockedNumberId}"
        }

        return "${parent.path()}/phone-numbers"
    }

    /// <summary>
    /// Operation: Get Blocked/Allowed Phone Numbers
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListBlockedAllowedNumbersParameters? = null): com.ringcentral.definitions.BlockedAllowedPhoneNumbersList
    // public async Task<com.ringcentral.definitions.BlockedAllowedPhoneNumbersList> List(queryParams: com.ringcentral.definitions.ListBlockedAllowedNumbersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.BlockedAllowedPhoneNumbersList::class.java)
        // return await rc.Get<com.ringcentral.definitions.BlockedAllowedPhoneNumbersList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Add Blocked/Allowed Number
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
    /// </summary>
    fun post(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo
    // public async Task<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo> Post(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), addBlockedAllowedPhoneNumber).string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo>(this.path(false), addBlockedAllowedPhoneNumber);
    }

    /// <summary>
    /// Operation: Get Blocked/Allowed Number
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
    /// </summary>
    fun get(): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo
    // public async Task<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo> Get()
    {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo>(this.path());
    }

    /// <summary>
    /// Operation: Delete Blocked/Allowed Number
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    /// <summary>
    /// Operation: Update Blocked/Allowed Number
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
    /// </summary>
    fun put(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo
    // public async Task<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo> Put(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber)
    {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), addBlockedAllowedPhoneNumber).string(), com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo>(this.path(), addBlockedAllowedPhoneNumber);
    }

    fun com.ringcentral.paths.restapi.account.extension.callerblocking.Index.phonenumbers(blockedNumberId: String? = null): Index {
        return Index(this, blockedNumberId)
    }
}
