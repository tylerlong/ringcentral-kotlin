package com.ringcentral.definitions;


public class ExtensionInfoEventBody {
    /// <summary>
    /// Internal identifier of an extension
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Type of extension info change
    /// Enum: Update, Delete
    /// </summary>
    public String eventType;

    /// <summary>
    /// Returned for 'Update' event type only. The possible values are: /nAccountInfo - change of account parameters/nExtensionInfo - change of contact info, service features, departments, status/nPhoneNumber - change of phone numbers/nRole - change of permissions/nProfileImage - change of profile image
    /// </summary>
    public String[] hints;

    /// <summary>
    /// Internal identifier of a subscription owner extension
    /// </summary>
    public String ownerId;
}
