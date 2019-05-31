package com.ringcentral.paths.restapi.numberparser.parse

class Index(val parent: com.ringcentral.paths.restapi.numberparser.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/parse"
    }

    /**
     * Operation: Parse Phone Number
     * Http Post /restapi/v1.0/number-parser/parse
     */
    @JvmOverloads
    fun post(parsePhoneNumberRequest: com.ringcentral.definitions.ParsePhoneNumberRequest, queryParams: com.ringcentral.definitions.ParsePhoneNumberParameters? = null): com.ringcentral.definitions.ParsePhoneNumberResponse? {
        val str: String? = rc.post(this.path(), parsePhoneNumberRequest, queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.ParsePhoneNumberResponse::class.java)
    }

}
