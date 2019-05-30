package com.ringcentral.definitions;


public class ReadAccountPresenceParameters {
    /// <summary>
    /// Whether to return detailed telephony state
    /// </summary>
    public Boolean detailedTelephonyState;

    /// <summary>
    /// Whether to return SIP data
    /// </summary>
    public Boolean sipData;

    /// <summary>
    /// Page number for account presence information
    /// </summary>
    public Long page;

    /// <summary>
    /// Number for account presence information items per page
    /// </summary>
    public Long perPage;
}
