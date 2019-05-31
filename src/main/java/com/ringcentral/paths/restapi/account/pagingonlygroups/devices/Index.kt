package com.ringcentral.paths.restapi.account.pagingonlygroups.devices

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/devices"
    }

    /// <summary>
    /// Operation: Get Paging Group Devices
    /// Http Get /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/devices
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListPagingGroupDevicesParameters? = null): com.ringcentral.definitions.PagingOnlyGroupDevices
    // public async Task<com.ringcentral.definitions.PagingOnlyGroupDevices> Get(queryParams: com.ringcentral.definitions.ListPagingGroupDevicesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.PagingOnlyGroupDevices::class.java)
        // return await rc.Get<com.ringcentral.definitions.PagingOnlyGroupDevices>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.pagingonlygroups.Index.devices(): Index {
        return Index(this)
    }
}
