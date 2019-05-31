package com.ringcentral.paths.restapi.dictionary.location

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/location"
    }

    /// <summary>
    /// Operation: Get Location List
    /// Http Get /restapi/v1.0/dictionary/location
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListLocationsParameters? = null): com.ringcentral.definitions.GetLocationListResponse
    // public async Task<com.ringcentral.definitions.GetLocationListResponse> Get(queryParams: com.ringcentral.definitions.ListLocationsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GetLocationListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetLocationListResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.location(): Index {
        return Index(this)
    }
}
