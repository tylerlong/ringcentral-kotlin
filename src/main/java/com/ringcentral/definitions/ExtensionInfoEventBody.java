package com.ringcentral.definitions;


public class ExtensionInfoEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    /**
     * Type of extension info change
     * Enum: Update, Delete
     */
    public String eventType;

    /**
     * Returned for 'Update' event type only. The possible values are: /nAccountInfo - change of account parameters/nExtensionInfo - change of contact info, service features, departments, status/nPhoneNumber - change of phone numbers/nRole - change of permissions/nProfileImage - change of profile image
     */
    public String[] hints;

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
}
