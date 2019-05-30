package com.ringcentral.definitions;


public class EditPagingGroupRequest {
    /**
     * List of users that will be allowed to page a group specified
     */
    public String[] addedUserIds;

    /**
     * List of users that will be unallowed to page a group specified
     */
    public String[] removedUserIds;

    /**
     * List of account devices that will be assigned to a paging group specified
     */
    public String[] addedDeviceIds;

    /**
     * List of account devices that will be unassigned from a paging group specified
     */
    public String[] removedDeviceIds;
}
