package com.ringcentral.definitions;


public class ReadGlipPostsParameters {
    /// <summary>
    /// Max number of posts to be fetched by one request (Not more than 250).
    /// Maximum: 250
    /// Default: 30
    /// </summary>
    public Long recordCount;

    /// <summary>
    /// Pagination token.
    /// </summary>
    public String pageToken;
}
