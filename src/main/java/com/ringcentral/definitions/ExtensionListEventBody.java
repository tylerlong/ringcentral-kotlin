package com.ringcentral.definitions;


public class ExtensionListEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    /**
     * Type of extension info change
     * Enum: Create, Update, Delete
     */
    public String eventType;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
