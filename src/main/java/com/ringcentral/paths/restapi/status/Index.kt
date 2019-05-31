package com.ringcentral.paths.restapi.status

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/status"
    }

    /**
     * Operation: Get Service Status
     * Http Get /restapi/v1.0/status
     */
    fun get(): String? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
