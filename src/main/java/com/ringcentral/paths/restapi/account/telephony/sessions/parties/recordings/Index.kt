package com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings

class Index(val parent: com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index, val recordingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && recordingId != null) {
            return "${parent.path()}/recordings/${recordingId}"
        }

        return "${parent.path()}/recordings"
    }

    /**
     * Operation: Create Recording
     * Http Post /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings
     */
    fun post(): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false)).string(), String::class.java)
    }

    /**
     * Operation: Pause/Resume Recording
     * Http Patch /restapi/v1.0/account/{accountId}/telephony/sessions/{sessionId}/parties/{partyId}/recordings/{recordingId}
     */
    @JvmOverloads
    fun patch(callRecordingUpdate: com.ringcentral.definitions.CallRecordingUpdate, queryParams: com.ringcentral.definitions.PauseResumeCallRecordingParameters? = null): com.ringcentral.definitions.CallRecording {
        if (this.recordingId == null) {
            throw NullPointerException("recordingId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), callRecordingUpdate, queryParams).string(), com.ringcentral.definitions.CallRecording::class.java)
    }
}
