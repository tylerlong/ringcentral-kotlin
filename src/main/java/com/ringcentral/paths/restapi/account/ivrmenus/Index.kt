package com.ringcentral.paths.restapi.account.ivrmenus

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val ivrMenuId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ivrMenuId != null) {
            return "${parent.path()}/ivr-menus/${ivrMenuId}"
        }

        return "${parent.path()}/ivr-menus"
    }

    /// <summary>
    /// Operation: Create IVR Menu
    /// Http Post /restapi/v1.0/account/{accountId}/ivr-menus
    /// </summary>
    fun post(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo
    // public async Task<com.ringcentral.definitions.IVRMenuInfo> Post(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), iVRMenuInfo).string(), com.ringcentral.definitions.IVRMenuInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.IVRMenuInfo>(this.path(false), iVRMenuInfo);
    }

    /// <summary>
    /// Operation: Get IVR Menu
    /// Http Get /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
    /// </summary>
    fun get(): com.ringcentral.definitions.IVRMenuInfo
    // public async Task<com.ringcentral.definitions.IVRMenuInfo> Get()
    {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.IVRMenuInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.IVRMenuInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update IVR Menu
    /// Http Put /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
    /// </summary>
    fun put(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo
    // public async Task<com.ringcentral.definitions.IVRMenuInfo> Put(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo)
    {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), iVRMenuInfo).string(), com.ringcentral.definitions.IVRMenuInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.IVRMenuInfo>(this.path(), iVRMenuInfo);
    }

    fun com.ringcentral.paths.restapi.account.Index.ivrmenus(ivrMenuId: String? = null): Index {
        return Index(this, ivrMenuId)
    }
}
