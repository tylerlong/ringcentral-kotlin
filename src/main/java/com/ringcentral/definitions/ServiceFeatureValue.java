package com.ringcentral.definitions;


public class ServiceFeatureValue {
    /**
     *
     */
    public String featureName;

    /**
     *
     */
    public Boolean enabled;

    /**
     * Enum: Available, AccountTypeLimitation, ExtensionTypeLimitation, AccountLimitation, ExtensionLimitation, InsufficientPermissions, ApplicationLimitation
     */
    public String reason;
}
