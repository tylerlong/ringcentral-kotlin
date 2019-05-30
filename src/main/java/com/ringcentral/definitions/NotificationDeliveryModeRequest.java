package com.ringcentral.definitions;


public class NotificationDeliveryModeRequest {
    /**
     * Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
     * Enum: PubNub, WebHook, APNS, PubNub/APNS, PubNub/GCM
     */
    public String transportType;

    /**
     * Mandatory for 'APNS' and 'WebHook' transport types. For 'APNS' - internal identifier of a device 'device_token' for 'WebHook' - URL of a consumer service (cannot be changed during subscription update)
     */
    public String address;

    /**
     * Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is 'True' (even if specified as 'false'). If request contains only message event filters the value by default is 'False'
     */
    public Boolean encryption;

    /**
     * For 'PubNub/APNS', 'APNS' and 'PubNub/GCM' transport types. Name of a certificate
     */
    public String certificateName;

    /**
     * For 'PubNub/APNS' and 'PubNub/GCM' transport types. Identifier of a registration
     */
    public String registrationId;

    /**
     * For 'Webhook' transport type. Subscription verification key ensuring data security
     */
    public String verificationToken;
}
