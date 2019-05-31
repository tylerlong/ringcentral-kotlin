package com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callmonitoringgroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /// <summary>
    /// Operation: Update Call Monitoring Group List
    /// Http Post /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/bulk-assign
    /// </summary>
    fun post(callMonitoringBulkAssign: com.ringcentral.definitions.CallMonitoringBulkAssign): String
    // public async Task<String> Post(callMonitoringBulkAssign: com.ringcentral.definitions.CallMonitoringBulkAssign)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), callMonitoringBulkAssign).string(), String::class.java)
        // return await rc.Post<String>(this.path(), callMonitoringBulkAssign);
    }

    fun com.ringcentral.paths.restapi.account.callmonitoringgroups.Index.bulkassign(): Index {
        return Index(this)
    }
}
