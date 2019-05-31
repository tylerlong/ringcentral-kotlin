package com.ringcentral.paths.restapi.dictionary.language

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val languageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && languageId != null) {
            return "${parent.path()}/language/${languageId}"
        }

        return "${parent.path()}/language"
    }

    /// <summary>
    /// Operation: Get Language List
    /// Http Get /restapi/v1.0/dictionary/language
    /// </summary>
    fun list(): com.ringcentral.definitions.LanguageList
    // public async Task<com.ringcentral.definitions.LanguageList> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.LanguageList::class.java)
        // return await rc.Get<com.ringcentral.definitions.LanguageList>(this.path(false));
    }

    /// <summary>
    /// Operation: Get Language
    /// Http Get /restapi/v1.0/dictionary/language/{languageId}
    /// </summary>
    fun get(): com.ringcentral.definitions.LanguageInfo
    // public async Task<com.ringcentral.definitions.LanguageInfo> Get()
    {
        if (this.languageId == null) {
            throw NullPointerException("languageId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.LanguageInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.LanguageInfo>(this.path());
    }

    fun com.ringcentral.paths.restapi.dictionary.Index.language(languageId: String? = null): Index {
        return Index(this, languageId)
    }
}
