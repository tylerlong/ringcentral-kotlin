package com.ringcentral.paths.restapi.account.templates

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val templateId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && templateId != null) {
            return "${parent.path()}/templates/${templateId}"
        }

        return "${parent.path()}/templates"
    }

    /// <summary>
    /// Operation: Get User Template List
    /// Http Get /restapi/v1.0/account/{accountId}/templates
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListUserTemplatesParameters? = null): com.ringcentral.definitions.UserTemplates
    // public async Task<com.ringcentral.definitions.UserTemplates> List(queryParams: com.ringcentral.definitions.ListUserTemplatesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.UserTemplates::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserTemplates>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get User Template
    /// Http Get /restapi/v1.0/account/{accountId}/templates/{templateId}
    /// </summary>
    fun get(): com.ringcentral.definitions.TemplateInfo
    // public async Task<com.ringcentral.definitions.TemplateInfo> Get()
    {
        if (this.templateId == null) {
            throw NullPointerException("templateId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.TemplateInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.TemplateInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.templates(templateId: String? = null): Index {
        return Index(this, templateId)
    }
}
