package com.ringcentral.definitions;


public class SearchRequest {
    /// <summary>
    /// page size
    /// </summary>
    public Long count;

    /// <summary>
    /// only support 'userName' or 'email' filter expressions for now
    /// </summary>
    public String filter;

    /// <summary>
    /// </summary>
    public String[] schemas;

    /// <summary>
    /// start index (1-based)
    /// </summary>
    public Long startIndex;
}
