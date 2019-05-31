package com.ringcentral.paths.restapi.account.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/greeting"
    }

    /// <summary>
    /// Operation: Create Company Greeting
    /// Http Post /restapi/v1.0/account/{accountId}/greeting
    /// </summary>
    fun post(createCompanyGreetingRequest: com.ringcentral.definitions.CreateCompanyGreetingRequest): com.ringcentral.definitions.CustomCompanyGreetingInfo
    // public async Task<com.ringcentral.definitions.CustomCompanyGreetingInfo> Post(createCompanyGreetingRequest: com.ringcentral.definitions.CreateCompanyGreetingRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), createCompanyGreetingRequest, com.ringcentral.ContentType.MULTIPART).string(), com.ringcentral.definitions.CustomCompanyGreetingInfo::class.java)
    }

    fun com.ringcentral.paths.restapi.account.Index.greeting(): Index {
        return Index(this)
    }
}
