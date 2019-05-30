package com.ringcentral.definitions;


public class ListCompanyAnsweringRuleInfo {
    /// <summary>
    /// Internal identifier of an answering rule
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of an answering rule
    /// </summary>
    public String uri;

    /// <summary>
    /// Specifies if the rule is active or inactive. The default value is 'True'
    /// Default: true
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Type of an answering rule, the default value is 'Custom' = ['BusinessHours', 'AfterHours', 'Custom']
    /// Enum: BusinessHours, AfterHours, Custom
    /// </summary>
    public String type;

    /// <summary>
    /// Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
    /// </summary>
    public String name;
}
