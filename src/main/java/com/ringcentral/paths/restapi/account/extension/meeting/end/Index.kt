package com.ringcentral.paths.restapi.account.extension.meeting.end

class Index(val parent: com.ringcentral.paths.restapi.account.extension.meeting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/end"
    }

    /// <summary>
    /// Operation: End Meeting
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path()).string(), String::class.java)
        // return await rc.Post<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.meeting.Index.end(): Index {
        return Index(this)
    }
}
