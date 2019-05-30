package com.ringcentral.definitions;


public class ReadAccountPresenceParameters {
    /**
     * Whether to return detailed telephony state
     */
    public Boolean detailedTelephonyState;

    /**
     * Whether to return SIP data
     */
    public Boolean sipData;

    /**
     * Page number for account presence information
     */
    public Long page;

    /**
     * Number for account presence information items per page
     */
    public Long perPage;
}
