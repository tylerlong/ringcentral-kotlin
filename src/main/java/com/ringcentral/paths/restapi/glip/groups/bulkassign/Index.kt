package com.ringcentral.paths.restapi.glip.groups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /// <summary>
    /// Operation: Edit Group Members
    /// Http Post /restapi/v1.0/glip/groups/{groupId}/bulk-assign
    /// </summary>
    fun post(editGroupRequest: com.ringcentral.definitions.EditGroupRequest): com.ringcentral.definitions.GlipGroupInfo
    // public async Task<com.ringcentral.definitions.GlipGroupInfo> Post(editGroupRequest: com.ringcentral.definitions.EditGroupRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), editGroupRequest).string(), com.ringcentral.definitions.GlipGroupInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipGroupInfo>(this.path(), editGroupRequest);
    }

    fun com.ringcentral.paths.restapi.glip.groups.Index.bulkassign(): Index {
        return Index(this)
    }
}
