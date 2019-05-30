package com.ringcentral.definitions;


public class CompanyAnsweringRuleInfo {
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
    /// Type of an answering rule
    /// Default: Custom
    /// Enum: BusinessHours, AfterHours, Custom
    /// </summary>
    public String type;

    /// <summary>
    /// Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
    /// </summary>
    public String name;

    /// <summary>
    /// Answering rule will be applied when calls are received from the specified caller(s)
    /// </summary>
    public CompanyAnsweringRuleCallersInfoRequest[] callers;

    /// <summary>
    /// Answering rule will be applied when calling the specified number(s)
    /// </summary>
    public CompanyAnsweringRuleCalledNumberInfoRequest[] calledNumbers;

    /// <summary>
    /// Schedule when an answering rule should be applied
    /// </summary>
    public CompanyAnsweringRuleScheduleInfo schedule;

    /// <summary>
    /// Specifies how incoming calls are forwarded. The default value is 'Operator' 'Operator' - play company greeting and forward to operator extension 'Disconnect' - play company greeting and disconnect 'Bypass' - bypass greeting to go to selected extension = ['Operator', 'Disconnect', 'Bypass']
    /// Enum: Operator, Disconnect, Bypass
    /// </summary>
    public String callHandlingAction;

    /// <summary>
    /// Extension to which the call is forwarded in 'Bypass' mode
    /// </summary>
    public CompanyAnsweringRuleCallersInfoRequest extension;

    /// <summary>
    /// Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
    /// </summary>
    public GreetingInfo[] greetings;
}
