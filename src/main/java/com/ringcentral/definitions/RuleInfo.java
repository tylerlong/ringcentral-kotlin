package com.ringcentral.definitions;


public class RuleInfo {
    /**
     * Forwarding number (or group) ordinal
     */
    public Long index;

    /**
     * Number of rings for a forwarding number (or group)
     */
    public Long ringCount;

    /**
     * Forwarding number status. Returned only if `showInactiveNumbers` is set to `true`
     */
    public Boolean enabled;

    /**
     * Forwarding number (or group) data
     */
    public ForwardingNumberInfoRules[] forwardingNumbers;
}
