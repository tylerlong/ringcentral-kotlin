package com.ringcentral.paths.restapi.account.extension.addressbooksync

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/address-book-sync"
    }

    /// <summary>
    /// Operation: Address Book Synchronization
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.SyncAddressBookParameters? = null): com.ringcentral.definitions.AddressBookSync
    // public async Task<com.ringcentral.definitions.AddressBookSync> Get(queryParams: com.ringcentral.definitions.SyncAddressBookParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.AddressBookSync::class.java)
        // return await rc.Get<com.ringcentral.definitions.AddressBookSync>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.addressbooksync(): Index {
        return Index(this)
    }
}
