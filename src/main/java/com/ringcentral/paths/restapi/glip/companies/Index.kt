package com.ringcentral.paths.restapi.glip.companies

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val companyId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && companyId != null) {
            return "${parent.path()}/companies/${companyId}"
        }

        return "${parent.path()}/companies"
    }

    /// <summary>
    /// Operation: Get Company Info
    /// Http Get /restapi/v1.0/glip/companies/{companyId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipCompany
    // public async Task<com.ringcentral.definitions.GlipCompany> Get()
    {
        if (this.companyId == null) {
            throw NullPointerException("companyId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipCompany::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipCompany>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.companies(companyId: String? = null): Index {
        return Index(this, companyId)
    }
}
