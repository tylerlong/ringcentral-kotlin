package com.ringcentral.paths.restapi.account.callqueues.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callqueues.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Assign Multiple Call Queue Members
     * Http Post /restapi/v1.0/account/{accountId}/call-queues/{groupId}/bulk-assign
     */
    fun post(callQueueBulkAssignResource: com.ringcentral.definitions.CallQueueBulkAssignResource): String? {
        val str: String? = rc.post(this.path(), callQueueBulkAssignResource).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
