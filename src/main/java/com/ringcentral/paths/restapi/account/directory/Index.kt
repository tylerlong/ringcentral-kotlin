package com.ringcentral.paths.restapi.account.directory

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/directory"
    }

    fun com.ringcentral.paths.restapi.account.Index.directory(): Index {
        return Index(this)
    }
}
