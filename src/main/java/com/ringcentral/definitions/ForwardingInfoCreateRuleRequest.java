package com.ringcentral.definitions;


public class ForwardingInfoCreateRuleRequest {
    /**
     * Specifies if the first ring on desktop/mobile apps is enabled. The default value is 'True'
     */
    public Boolean notifyMySoftPhones;

    /**
     * Specifies if the administrator's softphone (desktop application) is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'True'
     */
    public Boolean notifyAdminSoftPhones;

    /**
     * Specifies delay between ring on apps and starting of a call forwarding
     * Default: 1
     */
    public Long softPhonesRingCount;

    /**
     * Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ringing all at the same time. The default value is 'Sequentially'
     * Enum: Sequentially, Simultaneously
     */
    public String ringingMode;

    /**
     * Information on a call forwarding rule
     */
    public RuleInfoCreateRuleRequest[] rules;

    /**
     * Specifies if mobile timeout is activated for the rule
     */
    public Boolean mobileTimeout;
}
