package com.ringcentral.paths.restapi.account.ivrmenus

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val ivrMenuId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ivrMenuId != null) {
            return "${parent.path()}/ivr-menus/${ivrMenuId}"
        }

        return "${parent.path()}/ivr-menus"
    }

    /**
     * Operation: Create IVR Menu
     * Http Post /restapi/v1.0/account/{accountId}/ivr-menus
     */
    fun post(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo? {
        val str: String? = rc.post(this.path(false), iVRMenuInfo).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.IVRMenuInfo::class.java)
    }


    /**
     * Operation: Get IVR Menu
     * Http Get /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
     */
    fun get(): com.ringcentral.definitions.IVRMenuInfo? {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.IVRMenuInfo::class.java)
    }


    /**
     * Operation: Update IVR Menu
     * Http Put /restapi/v1.0/account/{accountId}/ivr-menus/{ivrMenuId}
     */
    fun put(iVRMenuInfo: com.ringcentral.definitions.IVRMenuInfo): com.ringcentral.definitions.IVRMenuInfo? {
        if (this.ivrMenuId == null) {
            throw NullPointerException("ivrMenuId")
        }

        val str: String? = rc.put(this.path(), iVRMenuInfo).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.IVRMenuInfo::class.java)
    }

}
