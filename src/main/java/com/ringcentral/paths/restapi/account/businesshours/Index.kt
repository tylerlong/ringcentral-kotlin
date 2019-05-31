package com.ringcentral.paths.restapi.account.businesshours

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-hours"
    }

    /// <summary>
    /// Operation: Get Company Business Hours
    /// Http Get /restapi/v1.0/account/{accountId}/business-hours
    /// </summary>
    fun get(): com.ringcentral.definitions.CompanyBusinessHours
    // public async Task<com.ringcentral.definitions.CompanyBusinessHours> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CompanyBusinessHours::class.java)
        // return await rc.Get<com.ringcentral.definitions.CompanyBusinessHours>(this.path());
    }

    /// <summary>
    /// Operation: Update Company Business Hours
    /// Http Put /restapi/v1.0/account/{accountId}/business-hours
    /// </summary>
    fun put(companyBusinessHoursUpdateRequest: com.ringcentral.definitions.CompanyBusinessHoursUpdateRequest): com.ringcentral.definitions.CompanyBusinessHours
    // public async Task<com.ringcentral.definitions.CompanyBusinessHours> Put(companyBusinessHoursUpdateRequest: com.ringcentral.definitions.CompanyBusinessHoursUpdateRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), companyBusinessHoursUpdateRequest).string(), com.ringcentral.definitions.CompanyBusinessHours::class.java)
        // return await rc.Put<com.ringcentral.definitions.CompanyBusinessHours>(this.path(), companyBusinessHoursUpdateRequest);
    }

    fun com.ringcentral.paths.restapi.account.Index.businesshours(): Index {
        return Index(this)
    }
}
