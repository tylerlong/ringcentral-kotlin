package com.ringcentral.paths.restapi.account.extension.calllog

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val callRecordId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && callRecordId != null) {
            return "${parent.path()}/call-log/${callRecordId}"
        }

        return "${parent.path()}/call-log"
    }

    /**
     * Operation: Get User Call Log Records
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadUserCallLogParameters? = null): com.ringcentral.definitions.UserCallLogResponse? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.UserCallLogResponse::class.java)
    }


    /**
     * Operation: Delete User Call Log
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log
     */
    @JvmOverloads
    fun delete(queryParams: com.ringcentral.definitions.DeleteUserCallLogParameters? = null): String? {
        val str: String? = rc.delete(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    /**
     * Operation: Get User Call Record
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callRecordId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadUserCallRecordParameters? = null): com.ringcentral.definitions.UserCallLogRecord? {
        if (this.callRecordId == null) {
            throw NullPointerException("callRecordId")
        }

        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.UserCallLogRecord::class.java)
    }

}
