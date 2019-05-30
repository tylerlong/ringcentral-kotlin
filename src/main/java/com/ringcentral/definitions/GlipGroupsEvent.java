package com.ringcentral.definitions;


public class GlipGroupsEvent {
    /// <summary>
    /// Internal identifier of a group
    /// </summary>
    public String id;

    /// <summary>
    /// Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
    /// Enum: PrivateChat, Group, Team, PersonalChat
    /// </summary>
    public String type;

    /// <summary>
    /// For 'Team' group type only. Team access level
    /// </summary>
    public Boolean isPublic;

    /// <summary>
    /// For 'Team' group type only. Team name
    /// </summary>
    public String name;

    /// <summary>
    /// For 'Team' group type only. Team description
    /// </summary>
    public String description;

    /// <summary>
    /// Identifier(s) of group members
    /// </summary>
    public String[] members;

    /// <summary>
    /// Group creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Group last change datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Type of a group event. Only the person who joined/was added to a group will receive 'GroupJoined' notification. Only the person who left/was removed from a group will receive 'GroupLeft' notification
    /// Enum: GroupRenamed, GroupJoined, GroupLeft, GroupChanged
    /// </summary>
    public String eventType;
}
