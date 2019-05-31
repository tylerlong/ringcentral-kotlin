package com.ringcentral.paths.restapi.account.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/greeting"
    }

    /**
     * Operation: Create Company Greeting
     * Http Post /restapi/v1.0/account/{accountId}/greeting
     */
    fun post(createCompanyGreetingRequest: com.ringcentral.definitions.CreateCompanyGreetingRequest): com.ringcentral.definitions.CustomCompanyGreetingInfo? {
        val str: String? = rc.post(this.path(), createCompanyGreetingRequest, null, com.ringcentral.ContentType.MULTIPART).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CustomCompanyGreetingInfo::class.java)
    }

}
