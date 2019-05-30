package com.ringcentral.definitions;


public class RuleInfo {
    /// <summary>
    /// Forwarding number (or group) ordinal
    /// </summary>
    public Long index;

    /// <summary>
    /// Number of rings for a forwarding number (or group)
    /// </summary>
    public Long ringCount;

    /// <summary>
    /// Forwarding number status. Returned only if `showInactiveNumbers` is set to `true`
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Forwarding number (or group) data
    /// </summary>
    public ForwardingNumberInfoRules[] forwardingNumbers;
}
