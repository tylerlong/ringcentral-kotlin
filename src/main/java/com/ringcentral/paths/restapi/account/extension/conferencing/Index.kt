package com.ringcentral.paths.restapi.account.extension.conferencing

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/conferencing"
    }

    /**
     * Operation: Get User Conferencing Settings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ReadConferencingSettingsParameters? = null): com.ringcentral.definitions.GetConferencingInfoResponse? {
        val str: String? = rc.get(this.path(), queryParams).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetConferencingInfoResponse::class.java)
    }


    /**
     * Operation: Update User Conferencing Settings
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing
     */
    fun put(updateConferencingInfoRequest: com.ringcentral.definitions.UpdateConferencingInfoRequest): com.ringcentral.definitions.GetConferencingInfoResponse? {
        val str: String? = rc.put(this.path(), updateConferencingInfoRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.GetConferencingInfoResponse::class.java)
    }

}
