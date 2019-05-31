package com.ringcentral.paths.restapi.account.directory.entries

class Index(val parent: com.ringcentral.paths.restapi.account.directory.Index, val entryId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && entryId != null) {
            return "${parent.path()}/entries/${entryId}"
        }

        return "${parent.path()}/entries"
    }

    /// <summary>
    /// Operation: Get Company Directory Entries
    /// Http Get /restapi/v1.0/account/{accountId}/directory/entries
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListDirectoryEntriesParameters? = null): com.ringcentral.definitions.DirectoryResource
    // public async Task<com.ringcentral.definitions.DirectoryResource> List(queryParams: com.ringcentral.definitions.ListDirectoryEntriesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.DirectoryResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.DirectoryResource>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Corporate Directory Entry
    /// Http Get /restapi/v1.0/account/{accountId}/directory/entries/{entryId}
    /// </summary>
    fun get(): com.ringcentral.definitions.ContactResource
    // public async Task<com.ringcentral.definitions.ContactResource> Get()
    {
        if (this.entryId == null) {
            throw NullPointerException("entryId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.ContactResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.ContactResource>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.directory.Index.entries(entryId: String? = null): Index {
        return Index(this, entryId)
    }
}
