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
    fun get(): com.ringcentral.definitions.GlipPreferencesInfo? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipPreferencesInfo::class.java)
    }

}
