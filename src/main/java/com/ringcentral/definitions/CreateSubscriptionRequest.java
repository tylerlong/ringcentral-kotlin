package com.ringcentral.definitions;


public class CreateSubscriptionRequest {
    /**
     * Collection of URIs to API resources. For APNS transport type only message event filter is available
     * Required
     */
    public String[] eventFilters;

    /**
     * Notification delivery settings
     * Required
     */
    public NotificationDeliveryModeRequest deliveryMode;

    /**
     * Subscription lifetime in seconds. Max value is 7 days (604800 sec). For *WebHook* transport type max value might be set up to 630720000 seconds (20 years)
     * Default: 604800
     */
    public Long expiresIn;
}
