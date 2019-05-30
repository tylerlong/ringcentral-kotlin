package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class NotificationInfo {
    /// <summary>
    /// Alert information
    /// </summary>
    public AlertInfo alert;

    /// <summary>
    /// Number of incoming messages
    /// </summary>
    public String badge;

    /// <summary>
    /// Message sound
    /// </summary>
    public String sound;

    /// <summary>
    /// Content availability
    /// </summary>
    @JSONField(name = "content-available")
    public String contentAvailable;

    /// <summary>
    /// Category of a message
    /// </summary>
    public String category;
}
