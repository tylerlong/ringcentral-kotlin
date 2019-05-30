package com.ringcentral.definitions;


public class CreateSipRegistrationResponse {
    /**
     * Suggested interval in seconds to periodically call SIP-provision API and update the local cache
     */
    public Long pollingInterval;

    /**
     *
     */
    public String[] sipErrorCodes;

    /**
     * SIP settings for device
     * Required
     */
    public SIPInfoResponse[] sipInfo;

    /**
     * SIP flags data
     * Required
     */
    public SIPFlagsResponse[] sipFlags;
}
