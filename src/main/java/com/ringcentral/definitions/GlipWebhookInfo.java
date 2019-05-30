package com.ringcentral.definitions;


public class GlipWebhookInfo {
    /**
     * Internal identifier of a webhook
     */
    public String id;

    /**
     * Internal identifier of the user who created a webhook
     */
    public String creatorId;

    /**
     * Internal identifiers of groups where a webhook has been created
     */
    public String[] groupsId;

    /**
     * Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;

    /**
     * Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;

    /**
     * Public link to send a webhook payload
     */
    public String uri;

    /**
     * Current status of a webhook
     * Enum: Active, Suspended, Deleted
     */
    public String status;
}
