package com.ringcentral.paths.restapi.account.extension.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/greeting/${greetingId}"
        }

        return "${parent.path()}/greeting"
    }

    /// <summary>
    /// Operation: Create Custom User Greeting
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting
    /// </summary>
    fun post(createCustomUserGreetingRequest: com.ringcentral.definitions.CreateCustomUserGreetingRequest): com.ringcentral.definitions.CustomUserGreetingInfo
    // public async Task<com.ringcentral.definitions.CustomUserGreetingInfo> Post(createCustomUserGreetingRequest: com.ringcentral.definitions.CreateCustomUserGreetingRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createCustomUserGreetingRequest, com.ringcentral.ContentType.MULTIPART).string(), com.ringcentral.definitions.CustomUserGreetingInfo::class.java)
    }

    /// <summary>
    /// Operation: Get Custom Greeting
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}
    /// </summary>
    fun get(): com.ringcentral.definitions.CustomUserGreetingInfo
    // public async Task<com.ringcentral.definitions.CustomUserGreetingInfo> Get()
    {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CustomUserGreetingInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.CustomUserGreetingInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.greeting(greetingId: String? = null): Index {
        return Index(this, greetingId)
    }
}
