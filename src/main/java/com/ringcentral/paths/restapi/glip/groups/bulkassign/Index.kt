package com.ringcentral.paths.restapi.glip.groups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Edit Group Members
     * Http Post /restapi/v1.0/glip/groups/{groupId}/bulk-assign
     */
    fun post(editGroupRequest: com.ringcentral.definitions.EditGroupRequest): com.ringcentral.definitions.GlipGroupInfo? {
        val str: String? = rc.post(this.path(), editGroupRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipGroupInfo::class.java)
    }

}
