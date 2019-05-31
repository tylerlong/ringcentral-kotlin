package com.ringcentral.paths.restapi.account.callqueues

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/call-queues/${groupId}"
        }

        return "${parent.path()}/call-queues"
    }

    /// <summary>
    /// Operation: Get Call Queues
    /// Http Get /restapi/v1.0/account/{accountId}/call-queues
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListCallQueuesParameters? = null): com.ringcentral.definitions.CallQueues
    // public async Task<com.ringcentral.definitions.CallQueues> Get(queryParams: com.ringcentral.definitions.ListCallQueuesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.CallQueues::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallQueues>(this.path(false), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.Index.callqueues(groupId: String? = null): Index {
        return Index(this, groupId)
    }
}
