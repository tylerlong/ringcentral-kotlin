package com.ringcentral.definitions;


public class GlipEveryoneInfo {
    /**
     * Internal identifier of a chat
     */
    public String id;

    /**
     * Type of a chat
     * Enum: Everyone
     */
    public String type;

    /**
     * Chat name
     */
    public String name;

    /**
     * Chat description
     */
    public String description;

    /**
     * Chat creation datetime in ISO 8601 format
     */
    public String creationTime;

    /**
     * Chat last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;
}
