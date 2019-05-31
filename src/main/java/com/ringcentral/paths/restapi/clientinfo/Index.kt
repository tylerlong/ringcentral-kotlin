package com.ringcentral.paths.restapi.clientinfo

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/client-info"
    }

    fun com.ringcentral.paths.restapi.Index.clientinfo(): Index {
        return Index(this)
    }
}
