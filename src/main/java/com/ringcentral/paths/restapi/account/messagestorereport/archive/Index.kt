package com.ringcentral.paths.restapi.account.messagestorereport.archive

class Index(val parent: com.ringcentral.paths.restapi.account.messagestorereport.Index, val archiveId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && archiveId != null) {
            return "${parent.path()}/archive/${archiveId}"
        }

        return "${parent.path()}/archive"
    }

    /// <summary>
    /// Operation: Get Message Store Report Archive
    /// Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive
    /// </summary>
    fun list(): com.ringcentral.definitions.MessageStoreReportArchive
    // public async Task<com.ringcentral.definitions.MessageStoreReportArchive> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.MessageStoreReportArchive::class.java)
        // return await rc.Get<com.ringcentral.definitions.MessageStoreReportArchive>(this.path(false));
    }

    /// <summary>
    /// Operation: Get Message Store Report Archive Content
    /// Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}
    /// </summary>
    fun get(): String
    // public async Task<String> Get()
    {
        if (this.archiveId == null) {
            throw NullPointerException("archiveId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), String::class.java)
        // return await rc.Get<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.messagestorereport.Index.archive(archiveId: String? = null): Index {
        return Index(this, archiveId)
    }
}
