package com.ringcentral.paths.restapi.account.device

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val deviceId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && deviceId != null) {
            return "${parent.path()}/device/${deviceId}"
        }

        return "${parent.path()}/device"
    }

    /**
     * Operation: Get Device
     * Http Get /restapi/v1.0/account/{accountId}/device/{deviceId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadDeviceParameters? = null): com.ringcentral.definitions.GetDeviceInfoResponse? {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId")
        }

        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetDeviceInfoResponse::class.java)
    }


    /**
     * Operation: Update Device
     * Http Put /restapi/v1.0/account/{accountId}/device/{deviceId}
     */
    fun put(accountDeviceUpdate: com.ringcentral.definitions.AccountDeviceUpdate): com.ringcentral.definitions.DeviceResource? {
        if (this.deviceId == null) {
            throw NullPointerException("deviceId")
        }

        val str: String? = rc.put(this.path(), accountDeviceUpdate).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.DeviceResource::class.java)
    }

}
