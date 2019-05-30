package com.ringcentral.definitions;


public class EditPagingGroupRequest {
    /// <summary>
    /// List of users that will be allowed to page a group specified
    /// </summary>
    public String[] addedUserIds;

    /// <summary>
    /// List of users that will be unallowed to page a group specified
    /// </summary>
    public String[] removedUserIds;

    /// <summary>
    /// List of account devices that will be assigned to a paging group specified
    /// </summary>
    public String[] addedDeviceIds;

    /// <summary>
    /// List of account devices that will be unassigned from a paging group specified
    /// </summary>
    public String[] removedDeviceIds;
}
