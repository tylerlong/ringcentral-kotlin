package com.ringcentral.paths.restapi.account.extension.notificationsettings

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/notification-settings"
    }

    /// <summary>
    /// Operation: Get Notification Settings
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
    /// </summary>
    fun get(): com.ringcentral.definitions.NotificationSettings
    // public async Task<com.ringcentral.definitions.NotificationSettings> Get()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.NotificationSettings::class.java)
        // return await rc.Get<com.ringcentral.definitions.NotificationSettings>(this.path());
    }

    /// <summary>
    /// Operation: Update Notification Settings
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/notification-settings
    /// </summary>
    fun put(notificationSettingsUpdateRequest: com.ringcentral.definitions.NotificationSettingsUpdateRequest): com.ringcentral.definitions.NotificationSettings
    // public async Task<com.ringcentral.definitions.NotificationSettings> Put(notificationSettingsUpdateRequest: com.ringcentral.definitions.NotificationSettingsUpdateRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), notificationSettingsUpdateRequest).string(), com.ringcentral.definitions.NotificationSettings::class.java)
        // return await rc.Put<com.ringcentral.definitions.NotificationSettings>(this.path(), notificationSettingsUpdateRequest);
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.notificationsettings(): Index {
        return Index(this)
    }
}
