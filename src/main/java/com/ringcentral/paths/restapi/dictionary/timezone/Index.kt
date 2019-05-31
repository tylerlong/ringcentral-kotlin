package com.ringcentral.paths.restapi.dictionary.timezone

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val timezoneId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && timezoneId != null) {
            return "${parent.path()}/timezone/${timezoneId}"
        }

        return "${parent.path()}/timezone"
    }

    /**
     * Operation: Get Timezone List
     * Http Get /restapi/v1.0/dictionary/timezone
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListTimezonesParameters? = null): com.ringcentral.definitions.GetTimezoneListResponse? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetTimezoneListResponse::class.java)
    }


    /**
     * Operation: Get Timezone
     * Http Get /restapi/v1.0/dictionary/timezone/{timezoneId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadTimezoneParameters? = null): com.ringcentral.definitions.GetTimezoneInfoResponse? {
        if (this.timezoneId == null) {
            throw NullPointerException("timezoneId")
        }

        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetTimezoneInfoResponse::class.java)
    }

}
