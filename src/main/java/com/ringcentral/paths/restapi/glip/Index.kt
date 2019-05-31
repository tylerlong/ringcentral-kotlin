package com.ringcentral.paths.restapi.glip

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/glip"
    }

    fun com.ringcentral.paths.restapi.Index.glip(): Index {
        return Index(this)
    }
}
