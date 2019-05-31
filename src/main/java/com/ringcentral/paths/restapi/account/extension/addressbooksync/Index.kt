package com.ringcentral.paths.restapi.account.extension.addressbooksync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/address-book-sync"
    }

    /**
     * Operation: Address Book Synchronization
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.SyncAddressBookParameters? = null): com.ringcentral.definitions.AddressBookSync? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AddressBookSync::class.java)
    }

}
