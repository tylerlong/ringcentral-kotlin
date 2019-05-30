package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class APSInfo {
    /// <summary>
    /// If the value is '1' then notification is turned on even if the application is in background
    /// Default: 1
    /// </summary>
    @JSONField(name = "content-available")
    public Long contentAvailable;
}
