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
    fun post(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup? {
        val str: String? = rc.post(this.path(false), createCallMonitoringGroupRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallMonitoringGroup::class.java)
    }


    /**
     * Operation: Get Call Monitoring Groups List
     * Http Get /restapi/v1.0/account/{accountId}/call-monitoring-groups
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupsParameters? = null): com.ringcentral.definitions.CallMonitoringGroups? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallMonitoringGroups::class.java)
    }


    /**
     * Operation: Updates Call Monitoring Group
     * Http Put /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
     */
    fun put(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup? {
        if (this.groupId == null) {
            throw NullPointerException("groupId")
        }

        val str: String? = rc.put(this.path(), createCallMonitoringGroupRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.CallMonitoringGroup::class.java)
    }


    /**
     * Operation: Delete Call Monitoring Group
     * Http Delete /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
     */
    fun delete(): String? {
        if (this.groupId == null) {
            throw NullPointerException("groupId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    fun members(): com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index {
        return com.ringcentral.paths.restapi.account.callmonitoringgroups.members.Index(this)
    }


    fun bulkassign(): com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index {
        return com.ringcentral.paths.restapi.account.callmonitoringgroups.bulkassign.Index(this)
    }

}