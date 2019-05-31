package com.ringcentral.paths.restapi.dictionary.country

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val countryId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && countryId != null) {
            return "${parent.path()}/country/${countryId}"
        }

        return "${parent.path()}/country"
    }

    /// <summary>
    /// Operation: Get Country List
    /// Http Get /restapi/v1.0/dictionary/country
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListCountriesParameters? = null): com.ringcentral.definitions.GetCountryListResponse
    // public async Task<com.ringcentral.definitions.GetCountryListResponse> List(queryParams: com.ringcentral.definitions.ListCountriesParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GetCountryListResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetCountryListResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Get Country
    /// Http Get /restapi/v1.0/dictionary/country/{countryId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetCountryInfoDictionaryResponse
    // public async Task<com.ringcentral.definitions.GetCountryInfoDictionaryResponse> Get()
    {
        if (this.countryId == null) {
            throw NullPointerException("countryId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetCountryInfoDictionaryResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetCountryInfoDictionaryResponse>(this.path());
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.country(countryId: String? = null): Index {
        return Index(this, countryId)
    }
}
