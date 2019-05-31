package com.ringcentral.paths.restapi.account.extension.device

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/device"
    }

    /// <summary>
    /// Operation: Get Extension Device List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/device
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListExtensionDevicesParameters? = null): com.ringcentral.definitions.GetExtensionDevicesResponse
    // public async Task<com.ringcentral.definitions.GetExtensionDevicesResponse> Get(queryParams: com.ringcentral.definitions.ListExtensionDevicesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetExtensionDevicesResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetExtensionDevicesResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.device(): Index {
        return Index(this)
    }
}
