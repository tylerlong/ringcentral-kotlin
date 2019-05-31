package com.ringcentral.paths.restapi.account.extension.authzprofile

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/authz-profile"
    }

    /**
     * Operation: Get Authorization Profile
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile
     */
    fun get(): com.ringcentral.definitions.AuthProfileResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AuthProfileResource::class.java)
    }


    fun check(): com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index {
        return com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index(this)
    }

}