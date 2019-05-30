package com.ringcentral.definitions;


public class SubscriptionInfo {
    /**
     * Internal identifier of a subscription
     */
    public String id;

    /**
     * Canonical URI of a subscription
     */
    public String uri;

    /**
     * Collection of API resources (message-store/presence/detailed presence) corresponding to events the user is subscribed to
     */
    public String[] eventFilters;

    /**
     * Collection of API resources (message-store/presence/detailed presence) corresponding to events the user is not subscribed to due to certain limitations
     */
    public DisabledFilterInfo[] disabledFilters;

    /**
     * Subscription expiration datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String expirationTime;

    /**
     * Subscription lifetime in seconds
     * Default: 900
     */
    public Long expiresIn;

    /**
     * Subscription status
     * Enum: Active, Suspended, Blacklisted
     */
    public String status;

    /**
     * Subscription creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String creationTime;

    /**
     * Delivery mode data
     * Required
     */
    public NotificationDeliveryMode deliveryMode;

    /**
     *
     */
    public NotificationBlacklistedData blacklistedData;
}
