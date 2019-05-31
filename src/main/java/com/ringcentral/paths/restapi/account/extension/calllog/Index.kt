package com.ringcentral.paths.restapi.account.extension.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /// <summary>
    /// Operation: Get User Call Log Records
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ReadUserCallLogParameters? = null): com.ringcentral.definitions.UserCallLogResponse
    // public async Task<com.ringcentral.definitions.UserCallLogResponse> List(queryParams: com.ringcentral.definitions.ReadUserCallLogParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.UserCallLogResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserCallLogResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Delete User Call Log
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
    /// </summary>
    fun delete(queryParams: com.ringcentral.definitions.DeleteUserCallLogParameters? = null): String
    // public async Task<String> Delete(queryParams: com.ringcentral.definitions.DeleteUserCallLogParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path(false), queryParams).string(), String::class.java)
        // return await rc.Delete<String>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get User Call Record
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadUserCallRecordParameters? = null): com.ringcentral.definitions.UserCallLogRecord
    // public async Task<com.ringcentral.definitions.UserCallLogRecord> Get(queryParams: com.ringcentral.definitions.ReadUserCallRecordParameters? = null)
    {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.UserCallLogRecord::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserCallLogRecord>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.calllog(callRecordId: String? = null): Index {
        return Index(this, callRecordId)
    }
}
