package com.ringcentral.definitions;


public class EditGroupRequest {
    /**
     * List of users to be added to a team
     */
    public String[] addedPersonIds;

    /**
     * List of user email addresses to be added to a team (i.e. as guests)
     */
    public String[] addedPersonEmails;

    /**
     * List of users to be removed from a team
     */
    public String[] removedPersonIds;
}
