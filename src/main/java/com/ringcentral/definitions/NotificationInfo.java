package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class NotificationInfo {
    /**
     * Alert information
     */
    public AlertInfo alert;

    /**
     * Number of incoming messages
     */
    public String badge;

    /**
     * Message sound
     */
    public String sound;

    /**
     * Content availability
     */
    @JSONField(name = "content-available")
    public String contentAvailable;

    /**
     * Category of a message
     */
    public String category;
}
