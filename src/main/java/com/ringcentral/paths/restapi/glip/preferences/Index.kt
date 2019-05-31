package com.ringcentral.paths.restapi.glip.preferences

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/preferences"
    }

    /**
     * Operation: Get Preferences
     * Http Get /restapi/v1.0/glip/preferences
     */
    fun get(): com.ringcentral.definitions.GlipPreferencesInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipPreferencesInfo::class.java)
    }
}
