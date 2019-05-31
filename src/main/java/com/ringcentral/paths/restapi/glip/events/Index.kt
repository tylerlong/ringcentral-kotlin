package com.ringcentral.paths.restapi.glip.events

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val eventId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && eventId != null) {
            return "${parent.path()}/events/${eventId}"
        }

        return "${parent.path()}/events"
    }

    /// <summary>
    /// Operation: Get User Events List
    /// Http Get /restapi/v1.0/glip/events
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ReadGlipEventsParameters? = null): com.ringcentral.definitions.GlipEventsInfo
    // public async Task<com.ringcentral.definitions.GlipEventsInfo> List(queryParams: com.ringcentral.definitions.ReadGlipEventsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipEventsInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipEventsInfo>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Event
    /// Http Post /restapi/v1.0/glip/events
    /// </summary>
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo
    // public async Task<com.ringcentral.definitions.GlipEventInfo> Post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipEventCreate).string(), com.ringcentral.definitions.GlipEventInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipEventInfo>(this.path(false), glipEventCreate);
    }

    /// <summary>
    /// Operation: Get Event
    /// Http Get /restapi/v1.0/glip/events/{eventId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipEventInfo
    // public async Task<com.ringcentral.definitions.GlipEventInfo> Get()
    {
        if (this.eventId == null) {
            throw NullPointerException("eventId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipEventInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipEventInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Event
    /// Http Put /restapi/v1.0/glip/events/{eventId}
    /// </summary>
    fun put(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo
    // public async Task<com.ringcentral.definitions.GlipEventInfo> Put(glipEventCreate: com.ringcentral.definitions.GlipEventCreate)
    {
        if (this.eventId == null) {
            throw NullPointerException("eventId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), glipEventCreate).string(), com.ringcentral.definitions.GlipEventInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.GlipEventInfo>(this.path(), glipEventCreate);
    }

    /// <summary>
    /// Operation: Delete Event
    /// Http Delete /restapi/v1.0/glip/events/{eventId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.eventId == null) {
            throw NullPointerException("eventId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.events(eventId: String? = null): Index {
        return Index(this, eventId)
    }
}
