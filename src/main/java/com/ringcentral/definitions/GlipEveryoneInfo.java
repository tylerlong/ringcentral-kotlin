package com.ringcentral.definitions;


public class GlipEveryoneInfo {
    /// <summary>
    /// Internal identifier of a chat
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a chat
    /// Enum: Everyone
    /// </summary>
    public String type;

    /// <summary>
    /// Chat name
    /// </summary>
    public String name;

    /// <summary>
    /// Chat description
    /// </summary>
    public String description;

    /// <summary>
    /// Chat creation datetime in ISO 8601 format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Chat last change datetime in ISO 8601 format
    /// </summary>
    public String lastModifiedTime;
}
