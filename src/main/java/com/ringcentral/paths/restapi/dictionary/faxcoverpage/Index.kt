package com.ringcentral.paths.restapi.dictionary.faxcoverpage

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/fax-cover-page"
    }

    /// <summary>
    /// Operation: Get Fax Cover Page List
    /// Http Get /restapi/v1.0/dictionary/fax-cover-page
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListFaxCoverPagesParameters? = null): com.ringcentral.definitions.ListFaxCoverPagesResponse
    // public async Task<com.ringcentral.definitions.ListFaxCoverPagesResponse> Get(queryParams: com.ringcentral.definitions.ListFaxCoverPagesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.ListFaxCoverPagesResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.ListFaxCoverPagesResponse>(this.path(), queryParams);
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.faxcoverpage(): Index {
        return Index(this)
    }
}
