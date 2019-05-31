package com.ringcentral.paths.restapi.account.extension.greeting

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/greeting/${greetingId}"
        }

        return "${parent.path()}/greeting"
    }

    /**
     * Operation: Create Custom User Greeting
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting
     */
    fun post(createCustomUserGreetingRequest: com.ringcentral.definitions.CreateCustomUserGreetingRequest): com.ringcentral.definitions.CustomUserGreetingInfo? {
        val str: String? = rc.post(this.path(false), createCustomUserGreetingRequest, null, com.ringcentral.ContentType.MULTIPART).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CustomUserGreetingInfo::class.java)
    }


    /**
     * Operation: Get Custom Greeting
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/greeting/{greetingId}
     */
    fun get(): com.ringcentral.definitions.CustomUserGreetingInfo? {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CustomUserGreetingInfo::class.java)
    }

}
