package com.ringcentral.paths.restapi.account.extension.notificationsettings

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/notification-settings"
    }

    /**
     * Operation: Get Notification Settings
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
     */
    fun get(): com.ringcentral.definitions.NotificationSettings? {
        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.NotificationSettings::class.java)
    }


    /**
     * Operation: Update Notification Settings
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
     */
    fun put(notificationSettingsUpdateRequest: com.ringcentral.definitions.NotificationSettingsUpdateRequest): com.ringcentral.definitions.NotificationSettings? {
        val str: String? = rc.put(this.path(), notificationSettingsUpdateRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.NotificationSettings::class.java)
    }

}
