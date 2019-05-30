package com.ringcentral.definitions;


public class GlipCompany {
    /// <summary>
    /// Internal identifier of an RC account/Glip company, or tilde (~) to indicate a company the current user belongs to
    /// Required
    /// </summary>
    public String id;

    /// <summary>
    /// Name of a company
    /// </summary>
    public String name;

    /// <summary>
    /// Domain name of a company
    /// </summary>
    public String domain;

    /// <summary>
    /// Datetime of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// Required
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Datetime of last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// Required
    /// </summary>
    public String lastModifiedTime;
}
