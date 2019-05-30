package com.ringcentral.definitions;


public class ListGlipTeamsParameters {
    /// <summary>
    /// Number of teams to be fetched by one request. The maximum value is 250, by default - 30
    /// Maximum: 250
    /// Default: 30
    /// </summary>
    public Long recordCount;

    /// <summary>
    /// Pagination token.
    /// </summary>
    public String pageToken;
}