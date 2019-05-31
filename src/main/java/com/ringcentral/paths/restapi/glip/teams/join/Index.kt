package com.ringcentral.paths.restapi.glip.teams.join

class Index(val parent: com.ringcentral.paths.restapi.glip.teams.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/join"
    }

    /**
     * Operation: Join Team
     * Http Post /restapi/v1.0/glip/teams/{chatId}/join
     */
    fun post(): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
    }
}
