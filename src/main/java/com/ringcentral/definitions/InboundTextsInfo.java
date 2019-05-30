package com.ringcentral.definitions;


public class InboundTextsInfo {
    /// <summary>
    /// Email notification flag
    /// </summary>
    public Boolean notifyByEmail;

    /// <summary>
    /// SMS notification flag
    /// </summary>
    public Boolean notifyBySms;

    /// <summary>
    /// List of recipient email addresses for inbound text message notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    /// </summary>
    public String[] advancedEmailAddresses;

    /// <summary>
    /// List of recipient phone numbers for inbound text message notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    /// </summary>
    public String[] advancedSmsEmailAddresses;
}
