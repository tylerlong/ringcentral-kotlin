package com.ringcentral.paths.scim.health

class Index(val parent: com.ringcentral.paths.scim.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/health"
    }

    /**
     * Operation: check health
     * Http Get /scim/v2/health
     */
    fun get(): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
    }
}
