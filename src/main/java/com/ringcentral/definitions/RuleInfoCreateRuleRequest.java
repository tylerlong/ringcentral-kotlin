package com.ringcentral.definitions;


public class RuleInfoCreateRuleRequest {
    /// <summary>
    /// Forwarding number (or group) ordinal. Not returned for inactive numbers
    /// </summary>
    public Long index;

    /// <summary>
    /// Number of rings for a forwarding number (or group). For inactive numbers the default value ('4') is returned
    /// </summary>
    public Long ringCount;

    /// <summary>
    /// Phone number status
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Forwarding number (or group) data
    /// </summary>
    public ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers;
}
