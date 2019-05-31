package com.ringcentral.paths.restapi.account.pagingonlygroups

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val pagingOnlyGroupId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && pagingOnlyGroupId != null) {
            return "${parent.path()}/paging-only-groups/${pagingOnlyGroupId}"
        }

        return "${parent.path()}/paging-only-groups"
    }

    fun com.ringcentral.paths.restapi.account.Index.pagingonlygroups(pagingOnlyGroupId: String? = null): Index {
        return Index(this, pagingOnlyGroupId)
    }
}
