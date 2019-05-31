package com.ringcentral.paths.restapi.dictionary.country

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val countryId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && countryId != null) {
            return "${parent.path()}/country/${countryId}"
        }

        return "${parent.path()}/country"
    }

    /**
     * Operation: Get Country List
     * Http Get /restapi/v1.0/dictionary/country
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListCountriesParameters? = null): com.ringcentral.definitions.GetCountryListResponse? {
        val str: String? = rc.get(this.path(false), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetCountryListResponse::class.java)
    }


    /**
     * Operation: Get Country
     * Http Get /restapi/v1.0/dictionary/country/{countryId}
     */
    fun get(): com.ringcentral.definitions.GetCountryInfoDictionaryResponse? {
        if (this.countryId == null) {
            throw NullPointerException("countryId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetCountryInfoDictionaryResponse::class.java)
    }

}
