package com.ringcentral.paths.restapi.account.recording.content

class Index(val parent: com.ringcentral.paths.restapi.account.recording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/content"
    }

    /**
     * Operation: Get Call Recordings Data
     * Http Get /restapi/v1.0/account/{accountId}/recording/{recordingId}/content
     */
    fun get(): ByteArray {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), ByteArray::class.java)
    }
}
