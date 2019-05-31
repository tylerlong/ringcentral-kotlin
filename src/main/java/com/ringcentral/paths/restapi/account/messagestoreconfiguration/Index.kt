package com.ringcentral.paths.restapi.account.messagestoreconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/message-store-configuration"
    }

    /**
     * Operation: Get Message Store Configuration
     * Http Get /restapi/v1.0/account/{accountId}/message-store-configuration
     */
    fun get(): com.ringcentral.definitions.MessageStoreConfiguration {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)
    }

    /**
     * Operation: Update Message Store Configuration
     * Http Put /restapi/v1.0/account/{accountId}/message-store-configuration
     */
    fun put(messageStoreConfiguration: com.ringcentral.definitions.MessageStoreConfiguration): com.ringcentral.definitions.MessageStoreConfiguration {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), messageStoreConfiguration).string(), com.ringcentral.definitions.MessageStoreConfiguration::class.java)
    }
}
