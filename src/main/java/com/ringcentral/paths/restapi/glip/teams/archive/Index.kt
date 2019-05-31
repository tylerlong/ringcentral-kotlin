package com.ringcentral.paths.restapi.glip.teams.archive

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/archive"
    }

    /**
     * Operation: Archive Team
     * Http Post /restapi/v1.0/glip/teams/{chatId}/archive
     */
    fun post(): String? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
