package com.ringcentral.paths.restapi.account.pagingonlygroups.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /// <summary>
    /// Operation: Assign Paging Group Users and Devices
    /// Http Post /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/bulk-assign
    /// </summary>
    fun post(editPagingGroupRequest: com.ringcentral.definitions.EditPagingGroupRequest): String
    // public async Task<String> Post(editPagingGroupRequest: com.ringcentral.definitions.EditPagingGroupRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), editPagingGroupRequest).string(), String::class.java)
        // return await rc.Post<String>(this.path(), editPagingGroupRequest);
    }

    fun com.ringcentral.paths.restapi.account.pagingonlygroups.Index.bulkassign(): Index {
        return Index(this)
    }
}
