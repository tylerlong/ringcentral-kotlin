package com.ringcentral.definitions;


public class ExtensionInfoGrants {
    /// <summary>
    /// Internal identifier of an extension
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of an extension
    /// </summary>
    public String uri;

    /// <summary>
    /// Extension short number (usually 3 or 4 digits)
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// Extension type
    /// Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, Park Location
    /// </summary>
    public String type;
}
