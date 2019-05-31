package com.ringcentral.definitions;


// Returned if WebHook subscription is blacklisted
public class NotificationBlacklistedData {
    /**
     * Time of adding subscrition to a black list in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String blacklistedAt;
    /**
     * Reason of adding subscrition to a black list
     */
    public String reason;

    public NotificationBlacklistedData blacklistedAt(String blacklistedAt) {
        this.blacklistedAt = blacklistedAt;
        return this;
    }

    public NotificationBlacklistedData reason(String reason) {
        this.reason = reason;
        return this;
    }

}
