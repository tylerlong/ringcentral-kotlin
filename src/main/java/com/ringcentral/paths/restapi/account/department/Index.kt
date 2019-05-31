package com.ringcentral.paths.restapi.account.department

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val departmentId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && departmentId != null) {
            return "${parent.path()}/department/${departmentId}"
        }

        return "${parent.path()}/department"
    }

    fun com.ringcentral.paths.restapi.account.Index.department(departmentId: String? = null): Index {
        return Index(this, departmentId)
    }
}
