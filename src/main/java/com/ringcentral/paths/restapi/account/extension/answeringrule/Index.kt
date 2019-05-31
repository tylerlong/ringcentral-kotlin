package com.ringcentral.paths.restapi.account.extension.answeringrule

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val ruleId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && ruleId != null) {
            return "${parent.path()}/answering-rule/${ruleId}"
        }

        return "${parent.path()}/answering-rule"
    }

    /**
     * Operation: Get Call Handling Rules
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListAnsweringRulesParameters? = null): com.ringcentral.definitions.UserAnsweringRuleList? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.UserAnsweringRuleList::class.java)
    }


    /**
     * Operation: Create Call Handling Rule
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule
     */
    fun post(createAnsweringRuleRequest: com.ringcentral.definitions.CreateAnsweringRuleRequest): com.ringcentral.definitions.AnsweringRuleInfo? {
        val str: String? = rc.post(this.path(false), createAnsweringRuleRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AnsweringRuleInfo::class.java)
    }


    /**
     * Operation: Get Call Handling Rule
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadAnsweringRuleParameters? = null): com.ringcentral.definitions.AnsweringRuleInfo? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AnsweringRuleInfo::class.java)
    }


    /**
     * Operation: Update Call Handling Rule
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     */
    fun put(updateAnsweringRuleRequest: com.ringcentral.definitions.UpdateAnsweringRuleRequest): com.ringcentral.definitions.AnsweringRuleInfo? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val str: String? = rc.put(this.path(), updateAnsweringRuleRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.AnsweringRuleInfo::class.java)
    }


    /**
     * Operation: Delete Call Handling Rule
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{ruleId}
     */
    fun delete(): String? {
        if (this.ruleId == null) {
            throw NullPointerException("ruleId")
        }

        val str: String? = rc.delete(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
