package com.ringcentral.paths.restapi.account.ivrprompts

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val promptId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && promptId != null) {
            return "${parent.path()}/ivr-prompts/${promptId}"
        }

        return "${parent.path()}/ivr-prompts"
    }

    /// <summary>
    /// Operation: Create IVR Prompts
    /// Http Post /restapi/v1.0/account/{accountId}/ivr-prompts
    /// </summary>
    fun post(createIVRPromptRequest: com.ringcentral.definitions.CreateIvrPromptRequest): com.ringcentral.definitions.PromptInfo
    // public async Task<com.ringcentral.definitions.PromptInfo> Post(createIVRPromptRequest: com.ringcentral.definitions.CreateIvrPromptRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createIVRPromptRequest, com.ringcentral.ContentType.MULTIPART).string(), com.ringcentral.definitions.PromptInfo::class.java)
    }

    /// <summary>
    /// Operation: Get IVR Prompt List
    /// Http Get /restapi/v1.0/account/{accountId}/ivr-prompts
    /// </summary>
    fun list(): com.ringcentral.definitions.IVRPrompts
    // public async Task<com.ringcentral.definitions.IVRPrompts> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.IVRPrompts::class.java)
        // return await rc.Get<com.ringcentral.definitions.IVRPrompts>(this.path(false));
    }

    /// <summary>
    /// Operation: Get IVR Prompt
    /// Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
    /// </summary>
    fun get(): com.ringcentral.definitions.PromptInfo
    // public async Task<com.ringcentral.definitions.PromptInfo> Get()
    {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.PromptInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.PromptInfo>(this.path());
    }

    /// <summary>
    /// Operation: Delete IVR Prompt
    /// Http Delete /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    /// <summary>
    /// Operation: Update IVR Prompt
    /// Http Put /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
    /// </summary>
    fun put(): String
    // public async Task<String> Put()
    {
        if (this.promptId == null) {
            throw NullPointerException("promptId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path()).string(), String::class.java)
        // return await rc.Put<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.ivrprompts(promptId: String? = null): Index {
        return Index(this, promptId)
    }
}
