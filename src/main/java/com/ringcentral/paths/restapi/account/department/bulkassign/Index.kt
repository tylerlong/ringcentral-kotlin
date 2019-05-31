package com.ringcentral.paths.restapi.account.department.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.department.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /// <summary>
    /// Operation: Assign Multiple Department Members
    /// Http Post /restapi/v1.0/account/{accountId}/department/bulk-assign
    /// </summary>
    fun post(departmentBulkAssignResource: com.ringcentral.definitions.DepartmentBulkAssignResource): String
    // public async Task<String> Post(departmentBulkAssignResource: com.ringcentral.definitions.DepartmentBulkAssignResource)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), departmentBulkAssignResource).string(), String::class.java)
        // return await rc.Post<String>(this.path(), departmentBulkAssignResource);
    }

    fun com.ringcentral.paths.restapi.account.department.Index.bulkassign(): Index {
        return Index(this)
    }
}
