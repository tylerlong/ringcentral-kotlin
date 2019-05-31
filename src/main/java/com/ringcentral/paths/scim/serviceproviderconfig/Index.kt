package com.ringcentral.paths.scim.serviceproviderconfig

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/ServiceProviderConfig"
    }

    /// <summary>
    /// Operation: Get Service Provider Config
    /// Http Get /scim/v2/ServiceProviderConfig
    /// </summary>
    fun get(): com.ringcentral.definitions.ServiceProviderConfig
    // public async Task<com.ringcentral.definitions.ServiceProviderConfig> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.ServiceProviderConfig::class.java)
        // return await rc.Get<com.ringcentral.definitions.ServiceProviderConfig>(this.path());
    }

    fun com.ringcentral.paths.scim.Index.serviceproviderconfig(): Index {
        return Index(this)
    }
}
