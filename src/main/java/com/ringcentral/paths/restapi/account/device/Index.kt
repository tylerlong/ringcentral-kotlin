package com.ringcentral.paths.restapi.account.device

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val deviceId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && deviceId != null) {
            return "${parent.path()}/device/${deviceId}"
        }

        return "${parent.path()}/device"
    }

    /// <summary>
    /// Operation: Get Device
    /// Http Get /restapi/v1.0/account/{accountId}/device/{deviceId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadDeviceParameters? = null): com.ringcentral.definitions.GetDeviceInfoResponse
    // public async Task<com.ringcentral.definitions.GetDeviceInfoResponse> Get(queryParams: com.ringcentral.definitions.ReadDeviceParameters? = null)
    {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetDeviceInfoResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetDeviceInfoResponse>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Update Device
    /// Http Put /restapi/v1.0/account/{accountId}/device/{deviceId}
    /// </summary>
    fun put(accountDeviceUpdate: com.ringcentral.definitions.AccountDeviceUpdate): com.ringcentral.definitions.DeviceResource
    // public async Task<com.ringcentral.definitions.DeviceResource> Put(accountDeviceUpdate: com.ringcentral.definitions.AccountDeviceUpdate)
    {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), accountDeviceUpdate).string(), com.ringcentral.definitions.DeviceResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.DeviceResource>(this.path(), accountDeviceUpdate);
    }

    fun com.ringcentral.paths.restapi.account.Index.device(deviceId: String? = null): Index {
        return Index(this, deviceId)
    }
}
