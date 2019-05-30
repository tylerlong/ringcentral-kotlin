package com.ringcentral.definitions;


public class GlipCreateGroup {
    /// <summary>
    /// Type of a group to be created. 'PrivateChat' is a group of 2 members. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
    /// Required
    /// Enum: PrivateChat, Team
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
    /// Identifier(s) of group members. For 'PrivateChat' group type 2 members only are supported
    /// </summary>
    public String[] members;
}