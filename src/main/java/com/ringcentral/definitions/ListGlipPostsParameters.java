package com.ringcentral.definitions;


public class ListGlipPostsParameters {
    /**
     * Identifier of a group to filter posts
     */
    public String groupId;

    /**
     * Token of a page to be returned
     */
    public String pageToken;

    /**
     * Number of records to be returned. The maximum value is 250, by default - 30
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;
}
