package com.ringcentral.paths.restapi.glip.teams

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val chatId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && chatId != null) {
            return "${parent.path()}/teams/${chatId}"
        }

        return "${parent.path()}/teams"
    }

    /**
     * Operation: Get Teams
     * Http Get /restapi/v1.0/glip/teams
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListGlipTeamsParameters? = null): com.ringcentral.definitions.GlipTeamsList {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipTeamsList::class.java)
    }

    /**
     * Operation: Create Team
     * Http Post /restapi/v1.0/glip/teams
     */
    fun post(glipPostTeamBody: com.ringcentral.definitions.GlipPostTeamBody): com.ringcentral.definitions.GlipTeamInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipPostTeamBody).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
    }

    /**
     * Operation: Get Team
     * Http Get /restapi/v1.0/glip/teams/{chatId}
     */
    fun get(): com.ringcentral.definitions.GlipTeamInfo {
        if (this.chatId == null) {
            throw NullPointerException("chatId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
    }

    /**
     * Operation: Update Team
     * Http Patch /restapi/v1.0/glip/teams/{chatId}
     */
    fun patch(glipPatchTeamBody: com.ringcentral.definitions.GlipPatchTeamBody): com.ringcentral.definitions.GlipTeamInfo {
        if (this.chatId == null) {
            throw NullPointerException("chatId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), glipPatchTeamBody).string(), com.ringcentral.definitions.GlipTeamInfo::class.java)
    }

    /**
     * Operation: Delete Team
     * Http Delete /restapi/v1.0/glip/teams/{chatId}
     */
    fun delete(): String {
        if (this.chatId == null) {
            throw NullPointerException("chatId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }


    fun join(): com.ringcentral.paths.restapi.glip.teams.join.Index {
        return com.ringcentral.paths.restapi.glip.teams.join.Index(this)
    }


    fun leave(): com.ringcentral.paths.restapi.glip.teams.leave.Index {
        return com.ringcentral.paths.restapi.glip.teams.leave.Index(this)
    }


    fun add(): com.ringcentral.paths.restapi.glip.teams.add.Index {
        return com.ringcentral.paths.restapi.glip.teams.add.Index(this)
    }


    fun remove(): com.ringcentral.paths.restapi.glip.teams.remove.Index {
        return com.ringcentral.paths.restapi.glip.teams.remove.Index(this)
    }


    fun archive(): com.ringcentral.paths.restapi.glip.teams.archive.Index {
        return com.ringcentral.paths.restapi.glip.teams.archive.Index(this)
    }


    fun unarchive(): com.ringcentral.paths.restapi.glip.teams.unarchive.Index {
        return com.ringcentral.paths.restapi.glip.teams.unarchive.Index(this)
    }

}