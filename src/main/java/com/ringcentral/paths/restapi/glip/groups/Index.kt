package com.ringcentral.paths.restapi.glip.groups

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/groups/${groupId}"
        }

        return "${parent.path()}/groups"
    }

    /// <summary>
    /// Operation: Get User Groups
    /// Http Get /restapi/v1.0/glip/groups
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListGlipGroupsParameters? = null): com.ringcentral.definitions.GlipGroupList
    // public async Task<com.ringcentral.definitions.GlipGroupList> List(queryParams: com.ringcentral.definitions.ListGlipGroupsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipGroupList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipGroupList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Group
    /// Http Post /restapi/v1.0/glip/groups
    /// </summary>
    fun post(glipCreateGroup: com.ringcentral.definitions.GlipCreateGroup): com.ringcentral.definitions.GlipGroupInfo
    // public async Task<com.ringcentral.definitions.GlipGroupInfo> Post(glipCreateGroup: com.ringcentral.definitions.GlipCreateGroup)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipCreateGroup).string(), com.ringcentral.definitions.GlipGroupInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipGroupInfo>(this.path(false), glipCreateGroup);
    }

    /// <summary>
    /// Operation: Get Group
    /// Http Get /restapi/v1.0/glip/groups/{groupId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipGroupInfo
    // public async Task<com.ringcentral.definitions.GlipGroupInfo> Get()
    {
        if (this.groupId == null) {
            throw NullPointerException("groupId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipGroupInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipGroupInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.groups(groupId: String? = null): Index {
        return Index(this, groupId)
    }
}
