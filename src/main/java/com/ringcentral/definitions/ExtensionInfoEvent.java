package com.ringcentral.definitions;


public class ExtensionInfoEvent {
    /// <summary>
    /// Universally unique identifier of a notification
    /// </summary>
    public String uuid;

    /// <summary>
    /// Event filter URI
    /// </summary>
    public String event;

    /// <summary>
    /// Datetime of sending a notification in [ISO 8601](shttps://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
    /// </summary>
    public String timestamp;

    /// <summary>
    /// Internal identifier of a subscription
    /// </summary>
    public String subscriptionId;

    /// <summary>
    /// Notification payload body
    /// </summary>
    public ExtensionInfoEventBody body;
}
