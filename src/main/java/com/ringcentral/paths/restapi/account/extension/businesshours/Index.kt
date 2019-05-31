package com.ringcentral.paths.restapi.account.extension.businesshours

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-hours"
    }

    /// <summary>
    /// Operation: Get User Business Hours
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours
    /// </summary>
    fun get(): com.ringcentral.definitions.GetUserBusinessHoursResponse
    // public async Task<com.ringcentral.definitions.GetUserBusinessHoursResponse> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetUserBusinessHoursResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetUserBusinessHoursResponse>(this.path());
    }

    /// <summary>
    /// Operation: Update User Business Hours
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours
    /// </summary>
    fun put(userBusinessHoursUpdateRequest: com.ringcentral.definitions.UserBusinessHoursUpdateRequest): com.ringcentral.definitions.UserBusinessHoursUpdateResponse
    // public async Task<com.ringcentral.definitions.UserBusinessHoursUpdateResponse> Put(userBusinessHoursUpdateRequest: com.ringcentral.definitions.UserBusinessHoursUpdateRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), userBusinessHoursUpdateRequest).string(), com.ringcentral.definitions.UserBusinessHoursUpdateResponse::class.java)
        // return await rc.Put<com.ringcentral.definitions.UserBusinessHoursUpdateResponse>(this.path(), userBusinessHoursUpdateRequest);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.businesshours(): Index {
        return Index(this)
    }
}
