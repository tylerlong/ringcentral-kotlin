package com.ringcentral.definitions;


public class SearchDirectoryEntriesRequest {
    /**
     * String value to filter the contacts. The value specified is searched through the following fields: `firstName`, `lastName`, `extensionNumber`, `phoneNumber`, `email`
     */
    public String searchString;

    /**
     * If 'True' then contacts of all accounts in federation are returned. If 'False' then only contacts of the current account are returned, and account section is eliminated in this case
     * Default: true
     */
    public Boolean showFederated;

    /**
     * Type of extension to filter the contacts
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, IvrMenu, Limited, ApplicationExtension, Site, Bot
     */
    public String extensionType;

    /**
     * Sorting settings
     */
    public OrderBy[] orderBy;

    /**
     *
     */
    public Long page;

    /**
     *
     */
    public Long perPage;
}
