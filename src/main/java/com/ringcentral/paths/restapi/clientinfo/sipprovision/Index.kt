package com.ringcentral.paths.restapi.clientinfo.sipprovision

class Index(val parent: com.ringcentral.paths.restapi.clientinfo.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/sip-provision"
    }

    /// <summary>
    /// Operation: Register SIP Device
    /// Http Post /restapi/v1.0/client-info/sip-provision
    /// </summary>
    fun post(createSipRegistrationRequest: com.ringcentral.definitions.CreateSipRegistrationRequest): com.ringcentral.definitions.CreateSipRegistrationResponse
    // public async Task<com.ringcentral.definitions.CreateSipRegistrationResponse> Post(createSipRegistrationRequest: com.ringcentral.definitions.CreateSipRegistrationRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), createSipRegistrationRequest).string(), com.ringcentral.definitions.CreateSipRegistrationResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.CreateSipRegistrationResponse>(this.path(), createSipRegistrationRequest);
    }

    fun com.ringcentral.paths.restapi.clientinfo.Index.sipprovision(): Index {
        return Index(this)
    }
}
