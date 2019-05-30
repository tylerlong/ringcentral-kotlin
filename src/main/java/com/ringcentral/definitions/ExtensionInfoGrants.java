package com.ringcentral.definitions;


public class ExtensionInfoGrants {
    /**
     * Internal identifier of an extension
     */
    public String id;

    /**
     * Canonical URI of an extension
     */
    public String uri;

    /**
     * Extension short number (usually 3 or 4 digits)
     */
    public String extensionNumber;

    /**
     * Extension type
     * Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, Park Location
     */
    public String type;
}
