package com.ringcentral.paths.restapi.glip.groups.events

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/events"
    }

    /// <summary>
    /// Operation: Create Event by Group ID
    /// Http Post /restapi/v1.0/glip/groups/{groupId}/events
    /// </summary>
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo
    // public async Task<com.ringcentral.definitions.GlipEventInfo> Post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), glipEventCreate).string(), com.ringcentral.definitions.GlipEventInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipEventInfo>(this.path(), glipEventCreate);
    }

    /// <summary>
    /// Operation: Get Group Events
    /// Http Get /restapi/v1.0/glip/groups/{groupId}/events
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipEventInfo
    // public async Task<com.ringcentral.definitions.GlipEventInfo> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipEventInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipEventInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.groups.Index.events(): Index {
        return Index(this)
    }
}
