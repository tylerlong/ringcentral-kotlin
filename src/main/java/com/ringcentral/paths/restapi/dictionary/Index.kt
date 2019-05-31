package com.ringcentral.paths.restapi.dictionary

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/dictionary"
    }

    fun com.ringcentral.paths.restapi.Index.dictionary(): Index {
        return Index(this)
    }
}
