package com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers

class Index(val parent: com.ringcentral.paths.restapi.account.extension.callerblocking.Index, val blockedNumberId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && blockedNumberId != null) {
            return "${parent.path()}/phone-numbers/${blockedNumberId}"
        }

        return "${parent.path()}/phone-numbers"
    }

    /**
     * Operation: Get Blocked/Allowed Phone Numbers
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListBlockedAllowedNumbersParameters? = null): com.ringcentral.definitions.BlockedAllowedPhoneNumbersList? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.BlockedAllowedPhoneNumbersList::class.java)
    }


    /**
     * Operation: Add Blocked/Allowed Number
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     */
    fun post(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        val str: String? = rc.post(this.path(false), addBlockedAllowedPhoneNumber).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
    }


    /**
     * Operation: Get Blocked/Allowed Number
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun get(): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
    }


    /**
     * Operation: Delete Blocked/Allowed Number
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun delete(): String? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    /**
     * Operation: Update Blocked/Allowed Number
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     */
    fun put(addBlockedAllowedPhoneNumber: com.ringcentral.definitions.AddBlockedAllowedPhoneNumber): com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo? {
        if (this.blockedNumberId == null) {
            throw NullPointerException("blockedNumberId")
        }

        val str: String? = rc.put(this.path(), addBlockedAllowedPhoneNumber).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.BlockedAllowedPhoneNumberInfo::class.java)
    }

}
