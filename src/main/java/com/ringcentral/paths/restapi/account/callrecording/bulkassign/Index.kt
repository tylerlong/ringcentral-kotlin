package com.ringcentral.paths.restapi.account.callrecording.bulkassign

class Index(val parent: com.ringcentral.paths.restapi.account.callrecording.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/bulk-assign"
    }

    /// <summary>
    /// Operation: Update Call Recording Extension List
    /// Http Post /restapi/v1.0/account/{accountId}/call-recording/bulk-assign
    /// </summary>
    fun post(bulkAccountCallRecordingsResource: com.ringcentral.definitions.BulkAccountCallRecordingsResource): String
    // public async Task<String> Post(bulkAccountCallRecordingsResource: com.ringcentral.definitions.BulkAccountCallRecordingsResource)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), bulkAccountCallRecordingsResource).string(), String::class.java)
        // return await rc.Post<String>(this.path(), bulkAccountCallRecordingsResource);
    }

    fun com.ringcentral.paths.restapi.account.callrecording.Index.bulkassign(): Index {
        return Index(this)
    }
}
