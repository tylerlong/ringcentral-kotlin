package com.ringcentral.definitions;


public class CallMonitoringExtensionUpdate {
    /// <summary>
    /// Only the following extension types are allowed: User, DigitalUser, VirtualUser, FaxUser, Limited
    /// </summary>
    public String id;

    /// <summary>
    /// Set of call monitoring group permissions granted to the specified extension. In order to remove the specified extension from a call monitoring group use an empty value
    /// </summary>
    public String[] permissions;
}
