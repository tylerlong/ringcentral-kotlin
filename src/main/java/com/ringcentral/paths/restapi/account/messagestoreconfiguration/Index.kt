package com.ringcentral.paths.restapi.account.messagestoreconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/message-store-configuration"
    }

    /// <summary>
    /// Operation: Get Message Store Configuration
    /// Http Get /restapi/v1.0/account/{accountId}/message-store-configuration
    /// </summary>
    fun get(): com.ringcentral.definitions.MessageStoreConfiguration
    // public async Task<com.ringcentral.definitions.MessageStoreConfiguration> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)
        // return await rc.Get<com.ringcentral.definitions.MessageStoreConfiguration>(this.path());
    }

    /// <summary>
    /// Operation: Update Message Store Configuration
    /// Http Put /restapi/v1.0/account/{accountId}/message-store-configuration
    /// </summary>
    fun put(messageStoreConfiguration: com.ringcentral.definitions.MessageStoreConfiguration): com.ringcentral.definitions.MessageStoreConfiguration
    // public async Task<com.ringcentral.definitions.MessageStoreConfiguration> Put(messageStoreConfiguration: com.ringcentral.definitions.MessageStoreConfiguration)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), messageStoreConfiguration).string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)
        // return await rc.Put<com.ringcentral.definitions.MessageStoreConfiguration>(this.path(), messageStoreConfiguration);
    }

    fun com.ringcentral.paths.restapi.account.Index.messagestoreconfiguration(): Index {
        return Index(this)
    }
}
