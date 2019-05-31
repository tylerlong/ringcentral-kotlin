package com.ringcentral.paths.restapi.account.callqueues

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/call-queues/${groupId}"
        }

        return "${parent.path()}/call-queues"
    }

    /**
     * Operation: Get Call Queues
     * Http Get /restapi/v1.0/account/{accountId}/call-queues
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallQueuesParameters? = null): com.ringcentral.definitions.CallQueues? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallQueues::class.java)
    }


    fun members(): com.ringcentral.paths.restapi.account.callqueues.members.Index {
        return com.ringcentral.paths.restapi.account.callqueues.members.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index(this)
    }

}