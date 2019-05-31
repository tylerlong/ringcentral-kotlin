package com.ringcentral.paths.restapi.clientinfo.sipprovision

class Index(val parent: com.ringcentral.paths.restapi.clientinfo.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/sip-provision"
    }

    /**
     * Operation: Register SIP Device
     * Http Post /restapi/v1.0/client-info/sip-provision
     */
    fun post(createSipRegistrationRequest: com.ringcentral.definitions.CreateSipRegistrationRequest): com.ringcentral.definitions.CreateSipRegistrationResponse? {
        val str: String? = rc.post(this.path(), createSipRegistrationRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CreateSipRegistrationResponse::class.java)
    }

}
