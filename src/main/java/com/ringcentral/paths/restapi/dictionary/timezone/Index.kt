package com.ringcentral.paths.restapi.dictionary.timezone

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val timezoneId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && timezoneId != null) {
            return "${parent.path()}/timezone/${timezoneId}"
        }

        return "${parent.path()}/timezone"
    }

    /// <summary>
    /// Operation: Get Timezone List
    /// Http Get /restapi/v1.0/dictionary/timezone
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListTimezonesParameters? = null): com.ringcentral.definitions.GetTimezoneListResponse
    // public async Task<com.ringcentral.definitions.GetTimezoneListResponse> List(queryParams: com.ringcentral.definitions.ListTimezonesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetTimezoneListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetTimezoneListResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Timezone
    /// Http Get /restapi/v1.0/dictionary/timezone/{timezoneId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadTimezoneParameters? = null): com.ringcentral.definitions.GetTimezoneInfoResponse
    // public async Task<com.ringcentral.definitions.GetTimezoneInfoResponse> Get(queryParams: com.ringcentral.definitions.ReadTimezoneParameters? = null)
    {
        if (this.timezoneId == null) {
            throw NullPointerException("timezoneId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetTimezoneInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetTimezoneInfoResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.timezone(timezoneId: String? = null): Index {
        return Index(this, timezoneId)
    }
}
