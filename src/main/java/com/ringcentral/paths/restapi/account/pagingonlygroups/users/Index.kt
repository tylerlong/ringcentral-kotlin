package com.ringcentral.paths.restapi.account.pagingonlygroups.users

class Index(val parent: com.ringcentral.paths.restapi.account.pagingonlygroups.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/users"
    }

    /**
     * Operation: Get Paging Group Users
     * Http Get /restapi/v1.0/account/{accountId}/paging-only-groups/{pagingOnlyGroupId}/users
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListPagingGroupUsersParameters? = null): com.ringcentral.definitions.PagingOnlyGroupUsers? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.PagingOnlyGroupUsers::class.java)
    }

}
