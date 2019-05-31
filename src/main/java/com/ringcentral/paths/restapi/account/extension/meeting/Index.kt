package com.ringcentral.paths.restapi.account.extension.meeting

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val meetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && meetingId != null) {
            return "${parent.path()}/meeting/${meetingId}"
        }

        return "${parent.path()}/meeting"
    }

    /**
     * Operation: Get Scheduled Meetings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting
     */
    fun list(): com.ringcentral.definitions.MeetingsResource? {
        val str: String? = rc.get(this.path(false)).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MeetingsResource::class.java)
    }


    /**
     * Operation: Create Meetings
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting
     */
    fun post(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource): com.ringcentral.definitions.MeetingResponseResource? {
        val str: String? = rc.post(this.path(false), meetingRequestResource).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MeetingResponseResource::class.java)
    }


    /**
     * Operation: Get Meeting Info
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     */
    fun get(): com.ringcentral.definitions.MeetingResponseResource? {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MeetingResponseResource::class.java)
    }


    /**
     * Operation: Update Meeting
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     */
    fun put(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource): com.ringcentral.definitions.MeetingResponseResource? {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId")
        }

        val str: String? = rc.put(this.path(), meetingRequestResource).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MeetingResponseResource::class.java)
    }


    /**
     * Operation: Delete Meeting
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     */
    fun delete(): String? {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    fun serviceinfo(): com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo.Index {
        return com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo.Index(this)
    }


    fun end(): com.ringcentral.paths.restapi.account.extension.meeting.end.Index {
        return com.ringcentral.paths.restapi.account.extension.meeting.end.Index(this)
    }

}