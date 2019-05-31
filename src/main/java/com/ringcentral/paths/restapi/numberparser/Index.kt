package com.ringcentral.paths.restapi.numberparser

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/number-parser"
    }

    fun com.ringcentral.paths.restapi.Index.numberparser(): Index {
        return Index(this)
    }
}
