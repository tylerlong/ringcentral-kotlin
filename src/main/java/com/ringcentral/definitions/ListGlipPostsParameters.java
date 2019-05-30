package com.ringcentral.definitions;


public class ListGlipPostsParameters {
    /// <summary>
    /// Identifier of a group to filter posts
    /// </summary>
    public String groupId;

    /// <summary>
    /// Token of a page to be returned
    /// </summary>
    public String pageToken;

    /// <summary>
    /// Number of records to be returned. The maximum value is 250, by default - 30
    /// Maximum: 250
    /// Default: 30
    /// </summary>
    public Long recordCount;
}
