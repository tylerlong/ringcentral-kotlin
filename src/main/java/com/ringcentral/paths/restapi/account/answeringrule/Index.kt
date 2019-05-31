package com.ringcentral.paths.restapi.account.answeringrule

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val ruleId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ruleId != null) {
            return "${parent.path()}/answering-rule/${ruleId}"
        }

        return "${parent.path()}/answering-rule"
    }

    /// <summary>
    /// Operation: Create Company Call Handling Rule
    /// Http Post /restapi/v1.0/account/{accountId}/answering-rule
    /// </summary>
    fun post(companyAnsweringRuleRequest: com.ringcentral.definitions.CompanyAnsweringRuleRequest): com.ringcentral.definitions.CompanyAnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.CompanyAnsweringRuleInfo> Post(companyAnsweringRuleRequest: com.ringcentral.definitions.CompanyAnsweringRuleRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), companyAnsweringRuleRequest).string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.CompanyAnsweringRuleInfo>(this.path(false), companyAnsweringRuleRequest);
    }

    /// <summary>
    /// Operation: Get Company Call Handling Rule List
    /// Http Get /restapi/v1.0/account/{accountId}/answering-rule
    /// </summary>
    fun list(): com.ringcentral.definitions.CompanyAnsweringRuleList
    // public async Task<com.ringcentral.definitions.CompanyAnsweringRuleList> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.CompanyAnsweringRuleList::class.java)
        // return await rc.Get<com.ringcentral.definitions.CompanyAnsweringRuleList>(this.path(false));
    }

    /// <summary>
    /// Operation: Get Company Call Handling Rule
    /// Http Get /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
    /// </summary>
    fun get(): com.ringcentral.definitions.CompanyAnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.CompanyAnsweringRuleInfo> Get()
    {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.CompanyAnsweringRuleInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Company Call Handling Rule
    /// Http Put /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
    /// </summary>
    fun put(companyAnsweringRuleUpdate: com.ringcentral.definitions.CompanyAnsweringRuleUpdate): com.ringcentral.definitions.CompanyAnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.CompanyAnsweringRuleInfo> Put(companyAnsweringRuleUpdate: com.ringcentral.definitions.CompanyAnsweringRuleUpdate)
    {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), companyAnsweringRuleUpdate).string(), com.ringcentral.definitions.CompanyAnsweringRuleInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.CompanyAnsweringRuleInfo>(this.path(), companyAnsweringRuleUpdate);
    }

    /// <summary>
    /// Operation: Delete Company Call Handling Rule
    /// Http Delete /restapi/v1.0/account/{accountId}/answering-rule/{ruleId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.answeringrule(ruleId: String? = null): Index {
        return Index(this, ruleId)
    }
}
