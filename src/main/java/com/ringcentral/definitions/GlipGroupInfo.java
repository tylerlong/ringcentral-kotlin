package com.ringcentral.definitions;


public class GlipGroupInfo {
    /**
     * Internal identifier of a group
     */
    public String id;

    /**
     * Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
     * Enum: PrivateChat, Group, Team, PersonalChat
     */
    public String type;

    /**
     * For 'Team' group type only. Team access level
     */
    public Boolean isPublic;

    /**
     * For 'Team' group type only. Team name
     */
    public String name;

    /**
     * For 'Team' group type only. Team description
     */
    public String description;

    /**
     * Identifier(s) of group members
     */
    public String[] members;

    /**
     * Group creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;

    /**
     * Group last change datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;
}
