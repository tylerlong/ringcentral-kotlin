package com.ringcentral.paths.scim.serviceproviderconfig

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/ServiceProviderConfig"
    }

    /**
     * Operation: Get Service Provider Config
     * Http Get /scim/v2/ServiceProviderConfig
     */
    fun get(): com.ringcentral.definitions.ServiceProviderConfig? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.ServiceProviderConfig::class.java)
    }

}
