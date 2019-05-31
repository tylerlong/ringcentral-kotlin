package com.ringcentral.paths.restapi.glip.groups

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/groups/${groupId}"
        }

        return "${parent.path()}/groups"
    }

    /**
     * Operation: Get User Groups
     * Http Get /restapi/v1.0/glip/groups
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListGlipGroupsParameters? = null): com.ringcentral.definitions.GlipGroupList {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipGroupList::class.java)
    }

    /**
     * Operation: Create Group
     * Http Post /restapi/v1.0/glip/groups
     */
    fun post(glipCreateGroup: com.ringcentral.definitions.GlipCreateGroup): com.ringcentral.definitions.GlipGroupInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipCreateGroup).string(), com.ringcentral.definitions.GlipGroupInfo::class.java)
    }

    /**
     * Operation: Get Group
     * Http Get /restapi/v1.0/glip/groups/{groupId}
     */
    fun get(): com.ringcentral.definitions.GlipGroupInfo {
        if (this.groupId == null) {
            throw NullPointerException("groupId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipGroupInfo::class.java)
    }


    @JvmOverloads
    fun posts(postId: String? = null): com.ringcentral.paths.restapi.glip.groups.posts.Index {
        return com.ringcentral.paths.restapi.glip.groups.posts.Index(this, postId)
    }


    fun events(): com.ringcentral.paths.restapi.glip.groups.events.Index {
        return com.ringcentral.paths.restapi.glip.groups.events.Index(this)
    }


    fun webhooks(): com.ringcentral.paths.restapi.glip.groups.webhooks.Index {
        return com.ringcentral.paths.restapi.glip.groups.webhooks.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.glip.groups.bulkassign.Index {
        return com.ringcentral.paths.restapi.glip.groups.bulkassign.Index(this)
    }

}