package com.ringcentral.paths.restapi.account.telephony

class Index(val parent: com.ringcentral.paths.restapi.account.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/telephony"
    }

    fun com.ringcentral.paths.restapi.account.Index.telephony(): Index {
        return Index(this)
    }
}
