package com.ringcentral.definitions;


public class GlipCompany {
    /**
     * Internal identifier of an RC account/Glip company, or tilde (~) to indicate a company the current user belongs to
     * Required
     */
    public String id;

    /**
     * Name of a company
     */
    public String name;

    /**
     * Domain name of a company
     */
    public String domain;

    /**
     * Datetime of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Required
     */
    public String creationTime;

    /**
     * Datetime of last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Required
     */
    public String lastModifiedTime;
}
