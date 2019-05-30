package com.ringcentral.definitions;


public class GlipMentionsInfo {
    /**
     * Internal identifier of a user
     */
    public String id;

    /**
     * Type of mentions
     * Enum: Person, Team, File, Link, Event, Task, Note, Card
     */
    public String type;

    /**
     * Name of a user
     */
    public String name;
}
