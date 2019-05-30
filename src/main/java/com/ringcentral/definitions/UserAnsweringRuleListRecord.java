package com.ringcentral.definitions;


public class UserAnsweringRuleListRecord {
    /// <summary>
    /// Canonical URI to an answering rule resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of an asnwering rule
    /// </summary>
    public String id;

    /// <summary>
    /// Type of an answering rule
    /// Enum: BusinessHours, AfterHours, Custom
    /// </summary>
    public String type;

    /// <summary>
    /// Name of an answering rule specified by user
    /// </summary>
    public String name;

    /// <summary>
    /// Specifies if an answering rule is active or inactive
    /// </summary>
    public Boolean enabled;
}
