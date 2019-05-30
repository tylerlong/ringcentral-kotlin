package com.ringcentral.definitions;


public class GlipPersonInfo {
    /// <summary>
    /// Internal identifier of a user
    /// Required
    /// </summary>
    public String id;

    /// <summary>
    /// First name of a user
    /// </summary>
    public String firstName;

    /// <summary>
    /// Last name of a user
    /// </summary>
    public String lastName;

    /// <summary>
    /// Email of a user
    /// </summary>
    public String email;

    /// <summary>
    /// Photo of a user
    /// </summary>
    public String avatar;

    /// <summary>
    /// Internal identifier of a company
    /// </summary>
    public String companyId;

    /// <summary>
    /// Time of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Time of the last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String lastModifiedTime;
}
