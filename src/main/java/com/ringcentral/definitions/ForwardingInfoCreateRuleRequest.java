package com.ringcentral.definitions;


public class ForwardingInfoCreateRuleRequest {
    /// <summary>
    /// Specifies if the first ring on desktop/mobile apps is enabled. The default value is 'True'
    /// </summary>
    public Boolean notifyMySoftPhones;

    /// <summary>
    /// Specifies if the administrator's softphone (desktop application) is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'True'
    /// </summary>
    public Boolean notifyAdminSoftPhones;

    /// <summary>
    /// Specifies delay between ring on apps and starting of a call forwarding
    /// Default: 1
    /// </summary>
    public Long softPhonesRingCount;

    /// <summary>
    /// Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ringing all at the same time. The default value is 'Sequentially'
    /// Enum: Sequentially, Simultaneously
    /// </summary>
    public String ringingMode;

    /// <summary>
    /// Information on a call forwarding rule
    /// </summary>
    public RuleInfoCreateRuleRequest[] rules;

    /// <summary>
    /// Specifies if mobile timeout is activated for the rule
    /// </summary>
    public Boolean mobileTimeout;
}
