package com.ringcentral.paths.restapi.account.callmonitoringgroups.members

class Index(val parent: com.ringcentral.paths.restapi.account.callmonitoringgroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /**
     * Operation: Get Call Monitoring Group Member List
     * Http Get /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}/members
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupMembersParameters? = null): com.ringcentral.definitions.CallMonitoringGroupMemberList? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallMonitoringGroupMemberList::class.java)
    }

}
