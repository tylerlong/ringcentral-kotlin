package com.ringcentral.definitions;


public class GlipNavigationInfo {
    /// <summary>
    /// Previous page token. To get previous page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens
    /// </summary>
    public String prevPageToken;

    /// <summary>
    /// Next page token. To get next page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens
    /// </summary>
    public String nextPageToken;
}
