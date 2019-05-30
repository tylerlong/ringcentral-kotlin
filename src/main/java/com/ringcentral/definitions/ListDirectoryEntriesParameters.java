package com.ringcentral.definitions;


public class ListDirectoryEntriesParameters {
    /// <summary>
    /// If 'True' then contacts of all accounts in federation are returned. If 'False' then only contacts of the current account are returned, and account section is eliminated in this case
    /// Default: true
    /// </summary>
    public String showFederated;

    /// <summary>
    /// Type of an extension
    /// Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ParkLocation, Limited
    /// </summary>
    public String type;

    /// <summary>
    /// Page number
    /// Default: 1
    /// </summary>
    public String page;

    /// <summary>
    /// Records count to be returned per one page. The default value is 1000. Specific keyword values: `all` - all records are returned in one page; `max` - maximum count of records that can be returned in one page
    /// Maximum: 2000
    /// Default: 1000
    /// </summary>
    public String perPage;

    /// <summary>
    /// Internal identifier of the business site to which extensions belong
    /// </summary>
    public String siteId;
}
