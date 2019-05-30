package com.ringcentral.definitions;


public class GetVersionsResponse {
    /// <summary>
    /// Canonical URI of the API version
    /// </summary>
    public String uri;

    /// <summary>
    /// Full API version information: uri, number, release date
    /// </summary>
    public VersionInfo[] apiVersions;

    /// <summary>
    /// Server version
    /// </summary>
    public String serverVersion;

    /// <summary>
    /// Server revision
    /// </summary>
    public String serverRevision;
}
