package com.ringcentral.definitions;


public class ListExtensionDevicesParameters {
    /// <summary>
    /// Pooling type of a device
    /// Enum: Host, Guest, None
    /// </summary>
    public String linePooling;

    /// <summary>
    /// Device feature or multiple features supported
    /// Enum: Intercom, Paging, BLA
    /// </summary>
    public String feature;
}
