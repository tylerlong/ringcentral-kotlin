package com.ringcentral.definitions;


public class CreateAnsweringRuleRequest {
    /// <summary>
    /// Specifies if the rule is active or inactive. The default value is 'True'
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Type of an answering rule. The 'Custom' value should be specified
    /// Required
    /// </summary>
    public String type;

    /// <summary>
    /// Name of an answering rule specified by user
    /// Required
    /// </summary>
    public String name;

    /// <summary>
    /// Answering rule will be applied when calls are received from the specified caller(s)
    /// </summary>
    public CallersInfoRequest[] callers;

    /// <summary>
    /// Answering rules are applied when calling to selected number(s)
    /// </summary>
    public CalledNumberInfo[] calledNumbers;

    /// <summary>
    /// Schedule when an answering rule should be applied
    /// </summary>
    public ScheduleInfo schedule;

    /// <summary>
    /// Specifies how incoming calls are forwarded
    /// Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly
    /// </summary>
    public String callHandlingAction;

    /// <summary>
    /// Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    /// </summary>
    public ForwardingInfo forwarding;

    /// <summary>
    /// Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
    /// </summary>
    public UnconditionalForwardingInfo unconditionalForwarding;

    /// <summary>
    /// Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
    /// </summary>
    public QueueInfo queue;

    /// <summary>
    /// Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
    /// </summary>
    public TransferredExtensionInfo transfer;

    /// <summary>
    /// Specifies whether to take a voicemail and who should do it
    /// </summary>
    public VoicemailInfo voicemail;

    /// <summary>
    /// Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
    /// </summary>
    public GreetingInfo[] greetings;

    /// <summary>
    /// Call screening status. 'Off' - no call screening; 'NoCallerId' - if caller ID is missing, then callers are asked to say their name before connecting; 'UnknownCallerId' - if caller ID is not in contact list, then callers are asked to say their name before connecting; 'Always' - the callers are always asked to say their name before connecting. The default value is 'Off'
    /// Enum: Off, NoCallerId, UnknownCallerId, Always
    /// </summary>
    public String screening;
}
