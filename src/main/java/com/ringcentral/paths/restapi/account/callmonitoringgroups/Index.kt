package com.ringcentral.paths.restapi.account.callmonitoringgroups

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/call-monitoring-groups/${groupId}"
        }

        return "${parent.path()}/call-monitoring-groups"
    }

    /**
     * Operation: Create Call Monitoring Group
     * Http Post /restapi/v1.0/account/{accountId}/call-monitoring-groups
     */
    fun post(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createCallMonitoringGroupRequest).string(), com.ringcentral.definitions.CallMonitoringGroup::class.java)
    }

    /**
     * Operation: Get Call Monitoring Groups List
     * Http Get /restapi/v1.0/account/{accountId}/call-monitoring-groups
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupsParameters? = null): com.ringcentral.definitions.CallMonitoringGroups {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.CallMonitoringGroups::class.java)
    }

    /**
     * Operation: Updates Call Monitoring Group
     * Http Put /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
     */
    fun put(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup {
        if (this.groupId == null) {
            throw NullPointerException("groupId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), createCallMonitoringGroupRequest).string(), com.ringcentral.definitions.CallMonitoringGroup::class.java)
    }

    /**
     * Operation: Delete Call Monitoring Group
     * Http Delete /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
     */
    fun delete(): String {
        if (this.groupId == null) {
            throw NullPointerException("groupId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }


    fun members(): com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index {
        return com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index(this)
    }

}