package com.ringcentral.paths.restapi.account.callmonitoringgroups.members

class Index(val parent: com.ringcentral.paths.restapi.account.callmonitoringgroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /// <summary>
    /// Operation: Get Call Monitoring Group Member List
    /// Http Get /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/members
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupMembersParameters? = null): com.ringcentral.definitions.CallMonitoringGroupMemberList
    // public async Task<com.ringcentral.definitions.CallMonitoringGroupMemberList> Get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupMembersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.CallMonitoringGroupMemberList::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallMonitoringGroupMemberList>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.callmonitoringgroups.Index.members(): Index {
        return Index(this)
    }
}
