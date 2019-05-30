package com.ringcentral.definitions;


public class ReadGlipEventsParameters {
    /**
     * Number of groups to be fetched by one request. The maximum value is 250, by default - 30.
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;

    /**
     * Token of a page to be returned
     */
    public String pageToken;
}
