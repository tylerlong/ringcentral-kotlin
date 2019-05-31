package com.ringcentral.paths.restapi.account.recording.content

class Index(val parent: com.ringcentral.paths.restapi.account.recording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/content"
    }

    /// <summary>
    /// Operation: Get Call Recordings Data
    /// Http Get /restapi/v1.0/account/{accountId}/recording/{recordingId}/content
    /// </summary>
    fun get(): ByteArray
    // public async Task<ByteArray> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), ByteArray::class.java)
        // return await rc.Get<ByteArray>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.recording.Index.content(): Index {
        return Index(this)
    }
}
