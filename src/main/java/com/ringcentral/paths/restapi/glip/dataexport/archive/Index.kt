package com.ringcentral.paths.restapi.glip.dataexport.archive

class Index(val parent: com.ringcentral.paths.restapi.glip.dataexport.Index, val archiveId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && archiveId != null) {
            return "${parent.path()}/archive/${archiveId}"
        }

        return "${parent.path()}/archive"
    }

    /// <summary>
    /// Operation: Get Glip Data Archive
    /// Http Get /restapi/v1.0/glip/data-export/{taskId}/archive/{archiveId}
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

    fun com.ringcentral.paths.restapi.glip.dataexport.Index.archive(archiveId: String? = null): Index {
        return Index(this, archiveId)
    }
}
