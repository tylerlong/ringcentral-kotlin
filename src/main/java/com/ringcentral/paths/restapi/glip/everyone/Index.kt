package com.ringcentral.paths.restapi.glip.everyone

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/everyone"
    }

    /**
     * Operation: Get Everyone Chat
     * Http Get /restapi/v1.0/glip/everyone
     */
    fun get(): com.ringcentral.definitions.GlipEveryoneInfo? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEveryoneInfo::class.java)
    }


    /**
     * Operation: Update Everyone Сhat
     * Http Patch /restapi/v1.0/glip/everyone
     */
    fun patch(updateGlipEveryoneRequest: com.ringcentral.definitions.UpdateGlipEveryoneRequest): com.ringcentral.definitions.GlipEveryoneInfo? {
        val str: String? = rc.patch(this.path(), updateGlipEveryoneRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEveryoneInfo::class.java)
    }

}
