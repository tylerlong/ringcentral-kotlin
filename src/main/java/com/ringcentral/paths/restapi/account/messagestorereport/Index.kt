package com.ringcentral.paths.restapi.account.messagestorereport

class Index(val parent: com.ringcentral.paths.restapi.account.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/message-store-report/${taskId}"
        }

        return "${parent.path()}/message-store-report"
    }

    /// <summary>
    /// Operation: Create Message Store Report
    /// Http Post /restapi/v1.0/account/{accountId}/message-store-report
    /// </summary>
    fun post(createMessageStoreReportRequest: com.ringcentral.definitions.CreateMessageStoreReportRequest): com.ringcentral.definitions.MessageStoreReport
    // public async Task<com.ringcentral.definitions.MessageStoreReport> Post(createMessageStoreReportRequest: com.ringcentral.definitions.CreateMessageStoreReportRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createMessageStoreReportRequest).string(), com.ringcentral.definitions.MessageStoreReport::class.java)
        // return await rc.Post<com.ringcentral.definitions.MessageStoreReport>(this.path(false), createMessageStoreReportRequest);
    }

    /// <summary>
    /// Operation: Get Message Store Report Task
    /// Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}
    /// </summary>
    fun get(): com.ringcentral.definitions.MessageStoreReport
    // public async Task<com.ringcentral.definitions.MessageStoreReport> Get()
    {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.MessageStoreReport::class.java)
        // return await rc.Get<com.ringcentral.definitions.MessageStoreReport>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.Index.messagestorereport(taskId: String? = null): Index {
        return Index(this, taskId)
    }
}
