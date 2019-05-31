package com.ringcentral.paths.restapi.account.extension.addressbook

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/address-book"
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.addressbook(): Index {
        return Index(this)
    }
}
