package com.ringcentral.paths.restapi.glip.recent

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/recent"
    }

    fun com.ringcentral.paths.restapi.glip.Index.recent(): Index {
        return Index(this)
    }
}
