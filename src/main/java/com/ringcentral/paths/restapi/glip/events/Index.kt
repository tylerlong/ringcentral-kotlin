package com.ringcentral.paths.restapi.glip.events

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val eventId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && eventId != null) {
            return "${parent.path()}/events/${eventId}"
        }

        return "${parent.path()}/events"
    }

    /**
     * Operation: Get User Events List
     * Http Get /restapi/v1.0/glip/events
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ReadGlipEventsParameters? = null): com.ringcentral.definitions.GlipEventsInfo? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventsInfo::class.java)
    }


    /**
     * Operation: Create Event
     * Http Post /restapi/v1.0/glip/events
     */
    fun post(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        val str: String? = rc.post(this.path(false), glipEventCreate).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventInfo::class.java)
    }


    /**
     * Operation: Get Event
     * Http Get /restapi/v1.0/glip/events/{eventId}
     */
    fun get(): com.ringcentral.definitions.GlipEventInfo? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventInfo::class.java)
    }


    /**
     * Operation: Update Event
     * Http Put /restapi/v1.0/glip/events/{eventId}
     */
    fun put(glipEventCreate: com.ringcentral.definitions.GlipEventCreate): com.ringcentral.definitions.GlipEventInfo? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val str: String? = rc.put(this.path(), glipEventCreate).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipEventInfo::class.java)
    }


    /**
     * Operation: Delete Event
     * Http Delete /restapi/v1.0/glip/events/{eventId}
     */
    fun delete(): String? {
        if (this.eventId == null) {
            throw NullPointerException("eventId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
