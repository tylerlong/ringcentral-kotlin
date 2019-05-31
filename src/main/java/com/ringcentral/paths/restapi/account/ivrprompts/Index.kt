package com.ringcentral.paths.restapi.account.ivrprompts

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val promptId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && promptId != null) {
            return "${parent.path()}/ivr-prompts/${promptId}"
        }

        return "${parent.path()}/ivr-prompts"
    }

    /**
     * Operation: Create IVR Prompts
     * Http Post /restapi/v1.0/account/{accountId}/ivr-prompts
     */
    fun post(createIVRPromptRequest: com.ringcentral.definitions.CreateIvrPromptRequest): com.ringcentral.definitions.PromptInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createIVRPromptRequest, null, com.ringcentral.ContentType.MULTIPART).string(), com.ringcentral.definitions.PromptInfo::class.java)
    }

    /**
     * Operation: Get IVR Prompt List
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts
     */
    fun list(): com.ringcentral.definitions.IVRPrompts {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.IVRPrompts::class.java)
    }

    /**
     * Operation: Get IVR Prompt
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    fun get(): com.ringcentral.definitions.PromptInfo {
        if (this.promptId == null) {
            throw NullPointerException("promptId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.PromptInfo::class.java)
    }

    /**
     * Operation: Delete IVR Prompt
     * Http Delete /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    fun delete(): String {
        if (this.promptId == null) {
            throw NullPointerException("promptId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }

    /**
     * Operation: Update IVR Prompt
     * Http Put /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}
     */
    fun put(): String {
        if (this.promptId == null) {
            throw NullPointerException("promptId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path()).string(), String::class.java)
    }


    fun content(): com.ringcentral.paths.restapi.account.ivrprompts.content.Index {
        return com.ringcentral.paths.restapi.account.ivrprompts.content.Index(this)
    }

}