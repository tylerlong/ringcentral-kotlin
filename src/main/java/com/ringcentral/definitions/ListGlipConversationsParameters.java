package com.ringcentral.definitions;


public class ListGlipConversationsParameters {
    /**
     * Number of conversations to be fetched by one request. The maximum value is 250, by default - 30
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;

    /**
     * Pagination token.
     */
    public String pageToken;
}
