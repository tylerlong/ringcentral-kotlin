package com.ringcentral.paths.restapi.account.messagestorereport.archive

class Index(val parent: com.ringcentral.paths.restapi.account.messagestorereport.Index, val archiveId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && archiveId != null) {
            return "${parent.path()}/archive/${archiveId}"
        }

        return "${parent.path()}/archive"
    }

    /**
     * Operation: Get Message Store Report Archive
     * Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive
     */
    fun list(): com.ringcentral.definitions.MessageStoreReportArchive? {
        val str: String? = rc.get(this.path(false)).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.MessageStoreReportArchive::class.java)
    }


    /**
     * Operation: Get Message Store Report Archive Content
     * Http Get /restapi/v1.0/account/{accountId}/message-store-report/{taskId}/archive/{archiveId}
     */
    fun get(): String? {
        if (this.archiveId == null) {
            throw NullPointerException("archiveId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
