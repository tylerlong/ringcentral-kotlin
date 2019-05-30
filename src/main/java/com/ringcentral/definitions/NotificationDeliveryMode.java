package com.ringcentral.definitions;


public class NotificationDeliveryMode {
    /// <summary>
    /// Notifications transportation provider name. 'APNS' (Apple Push Notifications Service)
    /// Enum: PubNub, APNS, PubNub/APNS/VoIP
    /// </summary>
    public String transportType;

    /// <summary>
    /// Optional parameter. Specifies if the message will be encrypted or not. For APNS transport type the value is always  false
    /// </summary>
    public Boolean encryption;

    /// <summary>
    /// PubNub channel name. For APNS transport type - internal identifier of a device  device_token
    /// </summary>
    public String address;

    /// <summary>
    /// PubNub subscriber credentials required to subscribe to the channel
    /// </summary>
    public String subscriberKey;

    /// <summary>
    /// PubNub subscriber credentials required to subscribe to the channel. Optional (for PubNub transport type only)
    /// </summary>
    public String secretKey;

    /// <summary>
    /// Encryption algorithm 'AES' (for PubNub transport type only)
    /// </summary>
    public String encryptionAlgorithm;

    /// <summary>
    /// Key for notification message decryption (for PubNub transport type only)
    /// </summary>
    public String encryptionKey;
}
