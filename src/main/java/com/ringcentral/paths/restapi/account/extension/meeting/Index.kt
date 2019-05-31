package com.ringcentral.paths.restapi.account.extension.meeting

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val meetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && meetingId != null) {
            return "${parent.path()}/meeting/${meetingId}"
        }

        return "${parent.path()}/meeting"
    }

    /// <summary>
    /// Operation: Get Scheduled Meetings
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting
    /// </summary>
    fun list(): com.ringcentral.definitions.MeetingsResource
    // public async Task<com.ringcentral.definitions.MeetingsResource> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.MeetingsResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.MeetingsResource>(this.path(false));
    }

    /// <summary>
    /// Operation: Create Meetings
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting
    /// </summary>
    fun post(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource): com.ringcentral.definitions.MeetingResponseResource
    // public async Task<com.ringcentral.definitions.MeetingResponseResource> Post(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), meetingRequestResource).string(), com.ringcentral.definitions.MeetingResponseResource::class.java)
        // return await rc.Post<com.ringcentral.definitions.MeetingResponseResource>(this.path(false), meetingRequestResource);
    }

    /// <summary>
    /// Operation: Get Meeting Info
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
    /// </summary>
    fun get(): com.ringcentral.definitions.MeetingResponseResource
    // public async Task<com.ringcentral.definitions.MeetingResponseResource> Get()
    {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.MeetingResponseResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.MeetingResponseResource>(this.path());
    }

    /// <summary>
    /// Operation: Update Meeting
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
    /// </summary>
    fun put(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource): com.ringcentral.definitions.MeetingResponseResource
    // public async Task<com.ringcentral.definitions.MeetingResponseResource> Put(meetingRequestResource: com.ringcentral.definitions.MeetingRequestResource)
    {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), meetingRequestResource).string(), com.ringcentral.definitions.MeetingResponseResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.MeetingResponseResource>(this.path(), meetingRequestResource);
    }

    /// <summary>
    /// Operation: Delete Meeting
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.meetingId == null) {
            throw NullPointerException("meetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.meeting(meetingId: String? = null): Index {
        return Index(this, meetingId)
    }
}
