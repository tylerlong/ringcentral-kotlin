package com.ringcentral.paths.restapi.account.businessaddress

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/business-address"
    }

    /**
     * Operation: Get Account Business Address
     * Http Get /restapi/v1.0/account/{accountId}/business-address
     */
    fun get(): com.ringcentral.definitions.AccountBusinessAddressResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
    }

    /**
     * Operation: Update Company Business Address
     * Http Put /restapi/v1.0/account/{accountId}/business-address
     */
    fun put(modifyAccountBusinessAddressRequest: com.ringcentral.definitions.ModifyAccountBusinessAddressRequest): com.ringcentral.definitions.AccountBusinessAddressResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), modifyAccountBusinessAddressRequest).string(), com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
    }
}
