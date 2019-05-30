package com.ringcentral.definitions;


public class ServiceFeatureValue {
    /// <summary>
    /// </summary>
    public String featureName;

    /// <summary>
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Enum: Available, AccountTypeLimitation, ExtensionTypeLimitation, AccountLimitation, ExtensionLimitation, InsufficientPermissions, ApplicationLimitation
    /// </summary>
    public String reason;
}
