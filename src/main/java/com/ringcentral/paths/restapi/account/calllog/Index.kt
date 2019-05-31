package com.ringcentral.paths.restapi.account.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /// <summary>
    /// Operation: Get Company Call Log Records
    /// Http Get /restapi/v1.0/account/{accountId}/call-log
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ReadCompanyCallLogParameters? = null): com.ringcentral.definitions.AccountCallLogResponse
    // public async Task<com.ringcentral.definitions.AccountCallLogResponse> List(queryParams: com.ringcentral.definitions.ReadCompanyCallLogParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.AccountCallLogResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.AccountCallLogResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Company Call Log Record(s)
    /// Http Get /restapi/v1.0/account/{accountId}/call-log/{callRecordId}
    /// </summary>
    fun get(): com.ringcentral.definitions.CompanyCallLogRecord
    // public async Task<com.ringcentral.definitions.CompanyCallLogRecord> Get()
    {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CompanyCallLogRecord::class.java)
        // return await rc.Get<com.ringcentral.definitions.CompanyCallLogRecord>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.calllog(callRecordId: String? = null): Index {
        return Index(this, callRecordId)
    }
}
