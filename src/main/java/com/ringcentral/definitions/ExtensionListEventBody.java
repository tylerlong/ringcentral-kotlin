package com.ringcentral.definitions;


public class ExtensionListEventBody {
    /// <summary>
    /// Internal identifier of an extension
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Type of extension info change
    /// Enum: Create, Update, Delete
    /// </summary>
    public String eventType;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
