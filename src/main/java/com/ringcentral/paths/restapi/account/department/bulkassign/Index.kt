package com.ringcentral.paths.restapi.account.department.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.department.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /**
     * Operation: Assign Multiple Department Members
     * Http Post /restapi/v1.0/account/{accountId}/department/bulk-assign
     */
    fun post(departmentBulkAssignResource: com.ringcentral.definitions.DepartmentBulkAssignResource): String? {
        val str: String? = rc.post(this.path(), departmentBulkAssignResource).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
