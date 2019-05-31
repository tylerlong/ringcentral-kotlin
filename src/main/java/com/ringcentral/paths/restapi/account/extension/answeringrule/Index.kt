package com.ringcentral.paths.restapi.account.extension.answeringrule

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val ruleId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ruleId != null) {
            return "${parent.path()}/answering-rule/${ruleId}"
        }

        return "${parent.path()}/answering-rule"
    }

    /// <summary>
    /// Operation: Get Call Handling Rules
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListAnsweringRulesParameters? = null): com.ringcentral.definitions.UserAnsweringRuleList
    // public async Task<com.ringcentral.definitions.UserAnsweringRuleList> List(queryParams: com.ringcentral.definitions.ListAnsweringRulesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.UserAnsweringRuleList::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserAnsweringRuleList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Call Handling Rule
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule
    /// </summary>
    fun post(createAnsweringRuleRequest: com.ringcentral.definitions.CreateAnsweringRuleRequest): com.ringcentral.definitions.AnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.AnsweringRuleInfo> Post(createAnsweringRuleRequest: com.ringcentral.definitions.CreateAnsweringRuleRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createAnsweringRuleRequest).string(), com.ringcentral.definitions.AnsweringRuleInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.AnsweringRuleInfo>(this.path(false), createAnsweringRuleRequest);
    }

    /// <summary>
    /// Operation: Get Call Handling Rule
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ReadAnsweringRuleParameters? = null): com.ringcentral.definitions.AnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.AnsweringRuleInfo> Get(queryParams: com.ringcentral.definitions.ReadAnsweringRuleParameters? = null)
    {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.AnsweringRuleInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.AnsweringRuleInfo>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Update Call Handling Rule
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
    /// </summary>
    fun put(updateAnsweringRuleRequest: com.ringcentral.definitions.UpdateAnsweringRuleRequest): com.ringcentral.definitions.AnsweringRuleInfo
    // public async Task<com.ringcentral.definitions.AnsweringRuleInfo> Put(updateAnsweringRuleRequest: com.ringcentral.definitions.UpdateAnsweringRuleRequest)
    {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), updateAnsweringRuleRequest).string(), com.ringcentral.definitions.AnsweringRuleInfo::class.java)
        // return await rc.Put<com.ringcentral.definitions.AnsweringRuleInfo>(this.path(), updateAnsweringRuleRequest);
    }

    /// <summary>
    /// Operation: Delete Call Handling Rule
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
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

    fun com.ringcentral.paths.restapi.account.extension.Index.answeringrule(ruleId: String? = null): Index {
        return Index(this, ruleId)
    }
}
