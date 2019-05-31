package com.ringcentral.paths.restapi.oauth

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/oauth"
    }

    fun com.ringcentral.paths.restapi.Index.oauth(): Index {
        return Index(this)
    }
}
