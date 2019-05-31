package com.ringcentral.paths.restapi.account.ivrprompts.content

class Index(val parent: com.ringcentral.paths.restapi.account.ivrprompts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/content"
    }

    /**
     * Operation: Get IVR Prompt Content
     * Http Get /restapi/v1.0/account/{accountId}/ivr-prompts/{promptId}/content
     */
    fun get(): String? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
