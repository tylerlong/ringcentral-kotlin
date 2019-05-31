package com.ringcentral.paths.restapi.dictionary.faxcoverpage

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/fax-cover-page"
    }

    /**
     * Operation: Get Fax Cover Page List
     * Http Get /restapi/v1.0/dictionary/fax-cover-page
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListFaxCoverPagesParameters? = null): com.ringcentral.definitions.ListFaxCoverPagesResponse? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.ListFaxCoverPagesResponse::class.java)
    }

}
