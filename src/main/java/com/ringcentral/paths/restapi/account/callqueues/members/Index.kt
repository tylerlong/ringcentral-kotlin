package com.ringcentral.paths.restapi.account.callqueues.members

class Index(val parent: com.ringcentral.paths.restapi.account.callqueues.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /**
     * Operation: Get Call Queue Members
     * Http Get /restapi/v1.0/account/{accountId}/call-queues/{groupId}/members
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallQueueMembersParameters? = null): com.ringcentral.definitions.CallQueueMembers? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallQueueMembers::class.java)
    }

}
