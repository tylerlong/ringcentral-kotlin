package com.ringcentral.paths.restapi.account.extension.meetingsconfiguration

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/meetings-configuration"
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.meetingsconfiguration(): Index {
        return Index(this)
    }
}
