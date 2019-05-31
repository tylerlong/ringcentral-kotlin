package com.ringcentral.paths.restapi.account.department.members

class Index(val parent: com.ringcentral.paths.restapi.account.department.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /**
     * Operation: Get Department Member List
     * Http Get /restapi/v1.0/account/{accountId}/department/{departmentId}/members
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListDepartmentMembersParameters? = null): com.ringcentral.definitions.DepartmentMemberList? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.DepartmentMemberList::class.java)
    }

}
