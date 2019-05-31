package com.ringcentral.paths.restapi.glip.teams.unarchive

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/unarchive"
    }

    /**
     * Operation: Unarchive Team
     * Http Post /restapi/v1.0/glip/teams/{chatId}/unarchive
     */
    fun post(): String? {
        val str: String? = rc.post(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
