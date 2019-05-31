package com.ringcentral.paths.restapi.account.directory.entries.search

class Index(val parent: com.ringcentral.paths.restapi.account.directory.entries.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/search"
    }

    /// <summary>
    /// Operation: Search Company Directory Entries
    /// Http Post /restapi/v1.0/account/{accountId}/directory/entries/search
    /// </summary>
    fun post(searchDirectoryEntriesRequest: com.ringcentral.definitions.SearchDirectoryEntriesRequest): com.ringcentral.definitions.DirectoryResource
    // public async Task<com.ringcentral.definitions.DirectoryResource> Post(searchDirectoryEntriesRequest: com.ringcentral.definitions.SearchDirectoryEntriesRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), searchDirectoryEntriesRequest).string(), com.ringcentral.definitions.DirectoryResource::class.java)
        // return await rc.Post<com.ringcentral.definitions.DirectoryResource>(this.path(), searchDirectoryEntriesRequest);
    }

    fun com.ringcentral.paths.restapi.account.directory.entries.Index.search(): Index {
        return Index(this)
    }
}
