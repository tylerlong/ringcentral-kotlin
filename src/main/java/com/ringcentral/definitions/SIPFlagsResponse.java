package com.ringcentral.definitions;


public class SIPFlagsResponse {
    /// <summary>
    /// If 'True' VoIP calling feature is enabled
    /// Enum: True, False
    /// </summary>
    public String voipFeatureEnabled;

    /// <summary>
    /// If 'True' the request is sent from IP address of a country blocked for VoIP calling
    /// Enum: True, False
    /// </summary>
    public String voipCountryBlocked;

    /// <summary>
    /// If 'True' outbound calls are enabled
    /// Enum: True, False
    /// </summary>
    public String outboundCallsEnabled;
}
