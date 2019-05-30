package com.ringcentral.definitions;


public class UpdateAnsweringRuleRequest {
    /**
     * Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
     */
    public ForwardingInfoCreateRuleRequest forwarding;

    /**
     * Specifies if the rule is active or inactive. The default value is 'True'
     */
    public Boolean enabled;

    /**
     * Name of an answering rule specified by user
     */
    public String name;

    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CallersInfoRequest[] callers;

    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;

    /**
     * Schedule when an answering rule should be applied
     */
    public ScheduleInfo schedule;

    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly
     */
    public String callHandlingAction;

    /**
     * Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
     */
    public UnconditionalForwardingInfo unconditionalForwarding;

    /**
     * Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
     */
    public QueueInfo queue;

    /**
     * Specifies whether to take a voicemail and who should do it
     */
    public VoicemailInfo voicemail;

    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;

    /**
     * Call screening status. 'Off' - no call screening; 'NoCallerId' - if caller ID is missing, then callers are asked to say their name before connecting; 'UnknownCallerId' - if caller ID is not in contact list, then callers are asked to say their name before connecting; 'Always' - the callers are always asked to say their name before connecting. The default value is 'Off'
     * Enum: Off, NoCallerId, UnknownCallerId, Always
     */
    public String screening;

    /**
     * Indicates whether inactive numbers should be returned or not.
     */
    public Boolean showInactiveNumbers;
}
