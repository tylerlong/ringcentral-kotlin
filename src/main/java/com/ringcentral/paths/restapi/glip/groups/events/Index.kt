package com.ringcentral.paths.restapi.glip.groups.events

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/events"
    }

    /**
     * Operation: Create Event by Group ID
     * Http Post /restapi/v1.0/glip/groups/{groupId}/events
     */
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        val str: String? = rc.post(this.path(), glipEventCreate).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventInfo::class.java)
    }


    /**
     * Operation: Get Group Events
     * Http Get /restapi/v1.0/glip/groups/{groupId}/events
     */
    fun get(): com.ringcentral.definitions.GlipEventInfo? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventInfo::class.java)
    }

}
