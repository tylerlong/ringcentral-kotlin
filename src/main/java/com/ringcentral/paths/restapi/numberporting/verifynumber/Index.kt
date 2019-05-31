package com.ringcentral.paths.restapi.numberporting.verifynumber

class Index(val parent: com.ringcentral.paths.restapi.numberporting.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/verify-number"
    }

    /// <summary>
    /// Operation: Verify Number
    /// Http Post /restapi/v1.0/number-porting/verify-number
    /// </summary>
    fun post(numberPortingVerifyNumberRequest: com.ringcentral.definitions.NumberPortingVerifyNumberRequest): com.ringcentral.definitions.NumberPortingVerifyNumberResponse
    // public async Task<com.ringcentral.definitions.NumberPortingVerifyNumberResponse> Post(numberPortingVerifyNumberRequest: com.ringcentral.definitions.NumberPortingVerifyNumberRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), numberPortingVerifyNumberRequest).string(), com.ringcentral.definitions.NumberPortingVerifyNumberResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.NumberPortingVerifyNumberResponse>(this.path(), numberPortingVerifyNumberRequest);
    }

    fun com.ringcentral.paths.restapi.numberporting.Index.verifynumber(): Index {
        return Index(this)
    }
}
