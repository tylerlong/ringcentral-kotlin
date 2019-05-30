package com.ringcentral.definitions;


public class UserSearchResponse {
    /// <summary>
    /// user list
    /// </summary>
    public UserResponse[] Resources;

    /// <summary>
    /// </summary>
    public Long itemsPerPage;

    /// <summary>
    /// </summary>
    public String[] schemas;

    /// <summary>
    /// </summary>
    public Long startIndex;

    /// <summary>
    /// </summary>
    public Long totalResults;
}
