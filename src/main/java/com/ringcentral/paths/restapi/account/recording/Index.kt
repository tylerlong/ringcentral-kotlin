package com.ringcentral.paths.restapi.account.recording

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val recordingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && recordingId != null) {
            return "${parent.path()}/recording/${recordingId}"
        }

        return "${parent.path()}/recording"
    }

    /// <summary>
    /// Operation: Get Call Recording
    /// Http Get /restapi/v1.0/account/{accountId}/recording/{recordingId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetCallRecordingResponse
    // public async Task<com.ringcentral.definitions.GetCallRecordingResponse> Get()
    {
        if (this.recordingId == null) {
            throw NullPointerException("recordingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetCallRecordingResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetCallRecordingResponse>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.recording(recordingId: String? = null): Index {
        return Index(this, recordingId)
    }
}
