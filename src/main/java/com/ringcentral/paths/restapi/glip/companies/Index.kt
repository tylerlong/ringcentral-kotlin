package com.ringcentral.paths.restapi.glip.companies

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val companyId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && companyId != null) {
            return "${parent.path()}/companies/${companyId}"
        }

        return "${parent.path()}/companies"
    }

    /**
     * Operation: Get Company Info
     * Http Get /restapi/v1.0/glip/companies/{companyId}
     */
    fun get(): com.ringcentral.definitions.GlipCompany? {
        if (this.companyId == null) {
            throw NullPointerException("companyId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GlipCompany::class.java)
    }

}
