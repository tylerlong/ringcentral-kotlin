package com.ringcentral.paths.restapi.account.callmonitoringgroups

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val groupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && groupId != null) {
            return "${parent.path()}/call-monitoring-groups/${groupId}"
        }

        return "${parent.path()}/call-monitoring-groups"
    }

    /// <summary>
    /// Operation: Create Call Monitoring Group
    /// Http Post /restapi/v1.0/account/{accountId}/call-monitoring-groups
    /// </summary>
    fun post(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup
    // public async Task<com.ringcentral.definitions.CallMonitoringGroup> Post(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createCallMonitoringGroupRequest).string(), com.ringcentral.definitions.CallMonitoringGroup::class.java)
        // return await rc.Post<com.ringcentral.definitions.CallMonitoringGroup>(this.path(false), createCallMonitoringGroupRequest);
    }

    /// <summary>
    /// Operation: Get Call Monitoring Groups List
    /// Http Get /restapi/v1.0/account/{accountId}/call-monitoring-groups
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupsParameters? = null): com.ringcentral.definitions.CallMonitoringGroups
    // public async Task<com.ringcentral.definitions.CallMonitoringGroups> Get(queryParams: com.ringcentral.definitions.ListCallMonitoringGroupsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.CallMonitoringGroups::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallMonitoringGroups>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Updates Call Monitoring Group
    /// Http Put /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
    /// </summary>
    fun put(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest): com.ringcentral.definitions.CallMonitoringGroup
    // public async Task<com.ringcentral.definitions.CallMonitoringGroup> Put(createCallMonitoringGroupRequest: com.ringcentral.definitions.CreateCallMonitoringGroupRequest)
    {
        if (this.groupId == null) {
            throw NullPointerException("groupId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), createCallMonitoringGroupRequest).string(), com.ringcentral.definitions.CallMonitoringGroup::class.java)
        // return await rc.Put<com.ringcentral.definitions.CallMonitoringGroup>(this.path(), createCallMonitoringGroupRequest);
    }

    /// <summary>
    /// Operation: Delete Call Monitoring Group
    /// Http Delete /restapi/v1.0/account/{accountId}/call-monitoring-groups/{groupId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.groupId == null) {
            throw NullPointerException("groupId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.callmonitoringgroups(groupId: String? = null): Index {
        return Index(this, groupId)
    }
}
