package com.ringcentral.definitions;


public class GetVersionResponse {
    /**
     * Canonical URI of the version info resource
     */
    public String uri;

    /**
     * Version of the RingCentral REST API
     */
    public String versionString;

    /**
     * Release date of this version
     */
    public String releaseDate;

    /**
     * URI part determining the current version
     */
    public String uriString;
}
