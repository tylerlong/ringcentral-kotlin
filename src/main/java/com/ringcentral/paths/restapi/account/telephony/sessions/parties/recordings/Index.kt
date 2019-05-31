package com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index, val recordingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && recordingId != null) {
            return "${parent.path()}/recordings/${recordingId}"
        }

        return "${parent.path()}/recordings"
    }

    /// <summary>
    /// Operation: Create Recording
    /// Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings
    /// </summary>
    fun post(): String
    // public async Task<String> Post()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false)).string(), String::class.java)
        // return await rc.Post<String>(this.path(false));
    }

    /// <summary>
    /// Operation: Pause/Resume Recording
    /// Http Patch /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings/{recordingId}
    /// </summary>
    fun patch(callRecordingUpdate: com.ringcentral.definitions.CallRecordingUpdate, queryParams: com.ringcentral.definitions.PauseResumeCallRecordingParameters? = null): com.ringcentral.definitions.CallRecording
    // public async Task<com.ringcentral.definitions.CallRecording> Patch(callRecordingUpdate: com.ringcentral.definitions.CallRecordingUpdate, queryParams: com.ringcentral.definitions.PauseResumeCallRecordingParameters? = null)
    {
        if (this.recordingId == null) {
            throw NullPointerException("recordingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), callRecordingUpdate, queryParams).string(), com.ringcentral.definitions.CallRecording::class.java)
        // return await rc.Patch<com.ringcentral.definitions.CallRecording>(this.path(), callRecordingUpdate, queryParams);
    }

    fun com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index.recordings(recordingId: String? = null): Index {
        return Index(this, recordingId)
    }
}
