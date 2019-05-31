package com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callmonitoringgroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Update Call Monitoring Group List
     * Http Post /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign
     */
    fun post(callMonitoringBulkAssign: com.ringcentral.definitions.CallMonitoringBulkAssign): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), callMonitoringBulkAssign).string(), String::class.java)
    }
}
