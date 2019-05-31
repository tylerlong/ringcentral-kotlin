package com.ringcentral.paths.restapi.account.pagingonlygroups.users

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/users"
    }

    /// <summary>
    /// Operation: Get Paging Group Users
    /// Http Get /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListPagingGroupUsersParameters? = null): com.ringcentral.definitions.PagingOnlyGroupUsers
    // public async Task<com.ringcentral.definitions.PagingOnlyGroupUsers> Get(queryParams: com.ringcentral.definitions.ListPagingGroupUsersParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.PagingOnlyGroupUsers::class.java)
        // return await rc.Get<com.ringcentral.definitions.PagingOnlyGroupUsers>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.account.pagingonlygroups.Index.users(): Index {
        return Index(this)
    }
}
