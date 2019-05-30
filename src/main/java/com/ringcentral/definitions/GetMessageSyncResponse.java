package com.ringcentral.definitions;


public class GetMessageSyncResponse {
    /**
     * List of message records with synchronization information
     * Required
     */
    public GetMessageInfoResponse[] records;

    /**
     * Sync type, token and time
     * Required
     */
    public SyncInfoMessages syncInfo;
}
