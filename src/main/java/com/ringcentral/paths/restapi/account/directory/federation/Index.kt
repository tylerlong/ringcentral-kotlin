package com.ringcentral.paths.restapi.account.directory.federation

class Index(val parent: com.ringcentral.paths.restapi.account.directory.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/federation"
    }

    /**
     * Operation: Get Account Federation
     * Http Get /restapi/v1.0/account/{accountId}/directory/federation
     */
    fun get(): com.ringcentral.definitions.FederationResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.FederationResource::class.java)
    }
}
