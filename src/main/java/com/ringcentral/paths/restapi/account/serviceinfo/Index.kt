package com.ringcentral.paths.restapi.account.serviceinfo

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/service-info"
    }

    /**
     * Operation: Get Account Service Info
     * Http Get /restapi/v1.0/account/{accountId}/service-info
     */
    fun get(): com.ringcentral.definitions.GetServiceInfoResponse {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetServiceInfoResponse::class.java)
    }
}
