package com.ringcentral.definitions;


public class GlipPersonInfo {
    /**
     * Internal identifier of a user
     * Required
     */
    public String id;

    /**
     * First name of a user
     */
    public String firstName;

    /**
     * Last name of a user
     */
    public String lastName;

    /**
     * Email of a user
     */
    public String email;

    /**
     * Photo of a user
     */
    public String avatar;

    /**
     * Internal identifier of a company
     */
    public String companyId;

    /**
     * Time of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;

    /**
     * Time of the last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;
}
