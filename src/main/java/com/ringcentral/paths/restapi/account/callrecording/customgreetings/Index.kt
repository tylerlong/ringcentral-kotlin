package com.ringcentral.paths.restapi.account.callrecording.customgreetings

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/custom-greetings/${greetingId}"
        }

        return "${parent.path()}/custom-greetings"
    }

    /// <summary>
    /// Operation: Get Call Recording Custom Greeting List
    /// Http Get /restapi/v1.0/account/{accountId}/call-recording/custom-greetings
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListCallRecordingCustomGreetingsParameters? = null): com.ringcentral.definitions.CallRecordingCustomGreetings
    // public async Task<com.ringcentral.definitions.CallRecordingCustomGreetings> Get(queryParams: com.ringcentral.definitions.ListCallRecordingCustomGreetingsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.CallRecordingCustomGreetings::class.java)
        // return await rc.Get<com.ringcentral.definitions.CallRecordingCustomGreetings>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Delete Call Recording Custom Greeting
    /// Http Delete /restapi/v1.0/account/{accountId}/call-recording/custom-greetings/{greetingId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.callrecording.Index.customgreetings(greetingId: String? = null): Index {
        return Index(this, greetingId)
    }
}
