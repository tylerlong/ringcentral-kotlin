package com.ringcentral.definitions;


public class AnsweringRuleInfo {
    /**
     * Canonical URI to an answering rule resource
     */
    public String uri;

    /**
     * Internal identifier of an answering rule
     */
    public String id;

    /**
     * Type of an answering rule
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;

    /**
     * Name of an answering rule specified by user
     */
    public String name;

    /**
     * Specifies if an answering rule is active or inactive
     */
    public Boolean enabled;

    /**
     * Schedule when an answering rule should be applied
     */
    public ScheduleInfo schedule;

    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;

    /**
     * Answering rules are applied when calls are received from specified caller(s)
     */
    public CallersInfo[] callers;

    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly
     */
    public String callHandlingAction;

    /**
     * Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
     */
    public ForwardingInfo forwarding;

    /**
     * Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
     */
    public UnconditionalForwardingInfo unconditionalForwarding;

    /**
     * Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
     */
    public QueueInfo queue;

    /**
     * Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
     */
    public TransferredExtensionInfo transfer;

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
}
