package com.ringcentral.paths.restapi.account.department.members

class Index(val parent: com.ringcentral.paths.restapi.account.department.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/members"
    }

    /// <summary>
    /// Operation: Get Department Member List
    /// Http Get /restapi/v1.0/account/{accountId}/department/{departmentId}/members
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListDepartmentMembersParameters? = null): com.ringcentral.definitions.DepartmentMemberList
    // public async Task<com.ringcentral.definitions.DepartmentMemberList> Get(queryParams: com.ringcentral.definitions.ListDepartmentMembersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.DepartmentMemberList::class.java)
        // return await rc.Get<com.ringcentral.definitions.DepartmentMemberList>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.department.Index.members(): Index {
        return Index(this)
    }
}
