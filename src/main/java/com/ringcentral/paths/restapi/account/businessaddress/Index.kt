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
    fun get(): com.ringcentral.definitions.AccountBusinessAddressResource? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
    }


    /**
     * Operation: Update Company Business Address
     * Http Put /restapi/v1.0/account/{accountId}/business-address
     */
    fun put(modifyAccountBusinessAddressRequest: com.ringcentral.definitions.ModifyAccountBusinessAddressRequest): com.ringcentral.definitions.AccountBusinessAddressResource? {
        val str: String? = rc.put(this.path(), modifyAccountBusinessAddressRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AccountBusinessAddressResource::class.java)
    }

}
