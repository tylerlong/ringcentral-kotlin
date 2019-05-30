package com.ringcentral.definitions;


public class CompanyAnsweringRuleUpdate {
    /**
     * Specifies if the rule is active or inactive. The default value is 'True'
     * Default: true
     */
    public Boolean enabled;

    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
     */
    public String name;

    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CompanyAnsweringRuleCallersInfoRequest[] callers;

    /**
     * Answering rule will be applied when calling the specified number(s)
     */
    public CompanyAnsweringRuleCalledNumberInfo[] calledNumbers;

    /**
     * Schedule when an answering rule should be applied
     */
    public CompanyAnsweringRuleScheduleInfoRequest schedule;

    /**
     * Specifies how incoming calls are forwarded. The default value is 'Operator' 'Operator' - play company greeting and forward to operator extension 'Disconnect' - play company greeting and disconnect 'Bypass' - bypass greeting to go to selected extension = ['Operator', 'Disconnect', 'Bypass']
     * Enum: Operator, Disconnect, Bypass
     */
    public String callHandlingAction;

    /**
     * Extension to which the call is forwarded in 'Bypass' mode
     */
    public CompanyAnsweringRuleCallersInfoRequest extension;

    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
}
