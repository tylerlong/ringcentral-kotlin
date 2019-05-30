package com.ringcentral.definitions;


public class InboundFaxesInfo {
    /// <summary>
    /// Email notification flag
    /// </summary>
    public Boolean notifyByEmail;

    /// <summary>
    /// SMS notification flag
    /// </summary>
    public Boolean notifyBySms;

    /// <summary>
    /// List of recipient email addresses for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    /// </summary>
    public String[] advancedEmailAddresses;

    /// <summary>
    /// List of recipient phone numbers for inbound fax notifications. Returned if specified, in both modes (advanced/basic). Applied in advanced mode only
    /// </summary>
    public String[] advancedSmsEmailAddresses;

    /// <summary>
    /// Indicates whether fax should be attached to email
    /// </summary>
    public Boolean includeAttachment;

    /// <summary>
    /// Indicates whether email should be automatically marked as read
    /// </summary>
    public Boolean markAsRead;
}
