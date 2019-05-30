package com.ringcentral.definitions;


public class GlipMentionsInfo {
    /// <summary>
    /// Internal identifier of a user
    /// </summary>
    public String id;

    /// <summary>
    /// Type of mentions
    /// Enum: Person, Team, File, Link, Event, Task, Note, Card
    /// </summary>
    public String type;

    /// <summary>
    /// Name of a user
    /// </summary>
    public String name;
}
