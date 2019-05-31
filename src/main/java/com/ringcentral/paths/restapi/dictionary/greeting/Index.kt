package com.ringcentral.paths.restapi.dictionary.greeting

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val greetingId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && greetingId != null) {
            return "${parent.path()}/greeting/${greetingId}"
        }

        return "${parent.path()}/greeting"
    }

    /// <summary>
    /// Operation: Get Standard Greeting List
    /// Http Get /restapi/v1.0/dictionary/greeting
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListStandardGreetingsParameters? = null): com.ringcentral.definitions.DictionaryGreetingList
    // public async Task<com.ringcentral.definitions.DictionaryGreetingList> List(queryParams: com.ringcentral.definitions.ListStandardGreetingsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.DictionaryGreetingList::class.java)
        // return await rc.Get<com.ringcentral.definitions.DictionaryGreetingList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Standard Greeting
    /// Http Get /restapi/v1.0/dictionary/greeting/{greetingId}
    /// </summary>
    fun get(): com.ringcentral.definitions.DictionaryGreetingInfo
    // public async Task<com.ringcentral.definitions.DictionaryGreetingInfo> Get()
    {
        if (this.greetingId == null) {
            throw NullPointerException("greetingId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.DictionaryGreetingInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.DictionaryGreetingInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.greeting(greetingId: String? = null): Index {
        return Index(this, greetingId)
    }
}
