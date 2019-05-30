package com.ringcentral.definitions;


public class NotificationSettings {
    /// <summary>
    /// Canonical URI of notifications settings resource
    /// </summary>
    public String uri;

    /// <summary>
    /// List of notification recipient email addresses
    /// </summary>
    public String[] emailAddresses;

    /// <summary>
    /// List of notification recipient email addresses
    /// </summary>
    public String[] smsEmailAddresses;

    /// <summary>
    /// Specifies notifications settings mode. If 'True' then advanced mode is on, it allows using different emails and/or phone numbers for each notification type. If 'False' then basic mode is on. Advanced mode settings are returned in both modes, if specified once, but if basic mode is switched on, they are not applied
    /// </summary>
    public Boolean advancedMode;

    /// <summary>
    /// </summary>
    public VoicemailsInfo voicemails;

    /// <summary>
    /// </summary>
    public InboundFaxesInfo inboundFaxes;

    /// <summary>
    /// </summary>
    public OutboundFaxesInfo outboundFaxes;

    /// <summary>
    /// </summary>
    public InboundTextsInfo inboundTexts;

    /// <summary>
    /// </summary>
    public MissedCallsInfo missedCalls;
}
