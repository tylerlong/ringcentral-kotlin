package com.ringcentral.definitions;


public class ListExtensionDevicesParameters {
    /**
     * Pooling type of a device
     * Enum: Host, Guest, None
     */
    public String linePooling;

    /**
     * Device feature or multiple features supported
     * Enum: Intercom, Paging, BLA
     */
    public String feature;
}
