package com.ringcentral.definitions;


public class EditGroupRequest {
    /// <summary>
    /// List of users to be added to a team
    /// </summary>
    public String[] addedPersonIds;

    /// <summary>
    /// List of user email addresses to be added to a team (i.e. as guests)
    /// </summary>
    public String[] addedPersonEmails;

    /// <summary>
    /// List of users to be removed from a team
    /// </summary>
    public String[] removedPersonIds;
}
