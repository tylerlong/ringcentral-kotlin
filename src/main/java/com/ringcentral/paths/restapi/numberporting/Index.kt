package com.ringcentral.paths.restapi.numberporting

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/number-porting"
    }

    fun com.ringcentral.paths.restapi.Index.numberporting(): Index {
        return Index(this)
    }
}
