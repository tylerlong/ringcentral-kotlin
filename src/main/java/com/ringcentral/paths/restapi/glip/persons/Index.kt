package com.ringcentral.paths.restapi.glip.persons

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val personId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && personId != null) {
            return "${parent.path()}/persons/${personId}"
        }

        return "${parent.path()}/persons"
    }

    /**
     * Operation: Get Person
     * Http Get /restapi/v1.0/glip/persons/{personId}
     */
    fun get(): com.ringcentral.definitions.GlipPersonInfo {
        if (this.personId == null) {
            throw NullPointerException("personId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipPersonInfo::class.java)
    }
}
