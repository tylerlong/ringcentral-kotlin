package com.ringcentral.definitions;


public class GlipWebhookInfo {
    /// <summary>
    /// Internal identifier of a webhook
    /// </summary>
    public String id;

    /// <summary>
    /// Internal identifier of the user who created a webhook
    /// </summary>
    public String creatorId;

    /// <summary>
    /// Internal identifiers of groups where a webhook has been created
    /// </summary>
    public String[] groupsId;

    /// <summary>
    /// Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Public link to send a webhook payload
    /// </summary>
    public String uri;

    /// <summary>
    /// Current status of a webhook
    /// Enum: Active, Suspended, Deleted
    /// </summary>
    public String status;
}
