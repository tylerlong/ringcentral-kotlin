package com.ringcentral.paths.restapi.dictionary.language

class Index(val parent: com.ringcentral.paths.restapi.dictionary.Index, val languageId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && languageId != null) {
            return "${parent.path()}/language/${languageId}"
        }

        return "${parent.path()}/language"
    }

    /**
     * Operation: Get Language List
     * Http Get /restapi/v1.0/dictionary/language
     */
    fun list(): com.ringcentral.definitions.LanguageList? {
        val str: String? = rc.get(this.path(false)).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.LanguageList::class.java)
    }


    /**
     * Operation: Get Language
     * Http Get /restapi/v1.0/dictionary/language/{languageId}
     */
    fun get(): com.ringcentral.definitions.LanguageInfo? {
        if (this.languageId == null) {
            throw NullPointerException("languageId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.LanguageInfo::class.java)
    }

}
