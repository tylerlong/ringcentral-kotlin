package com.ringcentral.definitions;


public class CreateSipRegistrationResponse {
    /// <summary>
    /// Suggested interval in seconds to periodically call SIP-provision API and update the local cache
    /// </summary>
    public Long pollingInterval;

    /// <summary>
    /// </summary>
    public String[] sipErrorCodes;

    /// <summary>
    /// SIP settings for device
    /// Required
    /// </summary>
    public SIPInfoResponse[] sipInfo;

    /// <summary>
    /// SIP flags data
    /// Required
    /// </summary>
    public SIPFlagsResponse[] sipFlags;
}
