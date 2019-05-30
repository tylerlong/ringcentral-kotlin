package com.ringcentral.definitions;


public class SearchViaGet2Parameters {
    /// <summary>
    /// only support 'userName' or 'email' filter expressions for now
    /// </summary>
    public String filter;

    /// <summary>
    /// start index (1-based)
    /// Default: 1
    /// </summary>
    public Long startIndex;

    /// <summary>
    /// page size
    /// Default: 100
    /// </summary>
    public Long count;
}
