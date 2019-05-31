package com.ringcentral.paths.restapi.account.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /**
     * Operation: Get Company Call Log Records
     * Http Get /restapi/v1.0/account/{accountId}/call-log
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadCompanyCallLogParameters? = null): com.ringcentral.definitions.AccountCallLogResponse? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AccountCallLogResponse::class.java)
    }


    /**
     * Operation: Get Company Call Log Record(s)
     * Http Get /restapi/v1.0/account/{accountId}/call-log/{callRecordId}
     */
    fun get(): com.ringcentral.definitions.CompanyCallLogRecord? {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CompanyCallLogRecord::class.java)
    }

}
