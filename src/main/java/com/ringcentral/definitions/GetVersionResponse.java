package com.ringcentral.definitions;


public class GetVersionResponse {
    /// <summary>
    /// Canonical URI of the version info resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Version of the RingCentral REST API
    /// </summary>
    public String versionString;

    /// <summary>
    /// Release date of this version
    /// </summary>
    public String releaseDate;

    /// <summary>
    /// URI part determining the current version
    /// </summary>
    public String uriString;
}
