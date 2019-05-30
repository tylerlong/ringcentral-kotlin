package com.ringcentral.definitions;


public class CallLogRecord {
    /// <summary>
    /// Internal identifier of a cal log record
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a call log record
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a call session
    /// </summary>
    public String sessionId;

    /// <summary>
    /// Caller information
    /// </summary>
    public CallLogCallerInfo from;

    /// <summary>
    /// Callee information
    /// </summary>
    public CallLogCallerInfo to;

    /// <summary>
    /// Call type
    /// Enum: Voice, Fax
    /// </summary>
    public String type;

    /// <summary>
    /// Call direction
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// Action description of the call operation
    /// Enum: Unknown, Phone Call, Phone Login, Incoming Fax, Accept Call, FindMe, FollowMe, Outgoing Fax, Call Return, Calling Card, Ring Directly, RingOut Web, VoIP Call, RingOut PC, RingMe, Transfer, 411 Info, Emergency, E911 Update, Support, RingOut Mobile
    /// </summary>
    public String action;

    /// <summary>
    /// Status description of the call operation
    /// Enum: Unknown, ResultInProgress, Missed, Call accepted, Voicemail, Rejected, Reply, Received, Receive Error, Fax on Demand, Partial Receive, Blocked, Call connected, No Answer, International Disabled, Busy, Send Error, Sent, No fax machine, ResultEmpty, Account, Suspended, Call Failed, Call Failure, Internal Error, IP Phone offline, Restricted Number, Wrong Number, Stopped, Hang up, Poor Line Quality, Partially Sent, International Restriction, Abandoned, Declined, Fax Receipt Error, Fax Send Error
    /// </summary>
    public String result;

    /// <summary>
    /// Reason of a call result:
///  * `Accepted` - The call was connected to and accepted by this number
///  * `Connected` - The call was answered, but there was no response on how to handle the call (for example, a voice mail system answered the call and did not push "1" to accept)
///  * `Line Busy` - The phone number you dialed was busy
///  * `Not Answered` - The phone number you dialed was not answered
///  * `No Answer` - You did not answer the call
///  * `Hang Up` - The caller hung up before the call was answered
///  * `Stopped` - This attempt was stopped because the call was answered by another phone
///  * `Internal Error` - An internal error occurred when making the call. Please try again
///  * `No Credit` - There was not enough Calling Credit on your account to make this call
///  * `Restricted Number` - The number you dialed is restricted by RingCentral
///  * `Wrong Number` - The number you dialed has either been disconnected or is not a valid phone number. Please check the number and try again
///  * `International Disabled` - International calling is not enabled on your account. Contact customer service to activate International Calling
///  * `International Restricted` - The country and/or area you attempted to call has been prohibited by your administrator
///  * `Bad Number` - An error occurred when making the call. Please check the number before trying again
///  * `Info 411 Restricted` - Calling to 411 Information Services is restricted
///  * `Customer 611 Restricted` - 611 customer service is not supported. Please contact customer service at <(888) 555-1212>
///  * `No Digital Line` - This DigitalLine was either not plugged in or did not have an internet connection
///  * `Failed Try Again` - Call failed. Please try again
///  * `Max Call Limit` - The number of simultaneous calls to your account has reached its limit
///  * `Too Many Calls` - The number of simultaneous calls for per DigitalLine associated with Other Phone has reached its limit. Please contact customer service
///  * `Calls Not Accepted` - Your account was not accepting calls at this time
///  * `Number Not Allowed` - The number that was dialed to access your account is not allowed
///  * `Number Blocked` - This number is in your Blocked Numbers list
///  * `Number Disabled` - The phone number and/or area you attempted to call has been prohibited by your administrator
///  * `Resource Error` - An error occurred when making the call. Please try again
///  * `Call Loop` - A call loop occurred due to an incorrect call forwarding configuration. Please check that you are not forwarding calls back to your own account
///  * `Fax Not Received` - An incoming fax could not be received because a proper connection with the sender's fax machine could not be established
///  * `Fax Partially Sent` - The fax was only partially sent. Possible explanations include phone line quality to poor to maintain the connection or the call was dropped
///  * `Fax Not Sent` - An attempt to send the fax was made, but could not connect with the receiving fax machine
///  * `Fax Poor Line` - An attempt to send the fax was made, but the phone line quality was too poor to send the fax
///  * `Fax Prepare Error` - An internal error occurred when preparing the fax. Please try again
///  * `Fax Save Error` - An internal error occurred when saving the fax. Please try again
///  * `Fax Send Error` - An error occurred when sending the fax. Please try again
    /// Enum: Accepted, Connected, line Busy, Not Answered, No Answer, Hang Up, Stopped, Internal Error, No Credit, Restricted Number, Wrong Number, International Restricted, Bad Number, Info 411 Restricted, Customer 611 Restricted, No Digital Line, Failed Try Again, Max Call Limit, Too Many Calls, Calls Not Accepted, Number Not Allowed, Number Blocked, Number Disabled, Resource Error, Call Loop, Fax Not Received, Fax Partially Sent, Fax Not Sent, Fax Poor Line, Fax Prepare Error, Fax Save Error, Fax Send Error
    /// </summary>
    public String reason;

    /// <summary>
    /// The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String startTime;

    /// <summary>
    /// Call duration in seconds
    /// </summary>
    public Long duration;

    /// <summary>
    /// Call recording data. Returned if the call is recorded, the withRecording parameter is set to 'True' in this case
    /// </summary>
    public CallLogRecordingInfo recording;

    /// <summary>
    /// For 'Detailed' view only. The datetime when the call log record was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// For 'Detailed' view only. Call transport
    /// Enum: PSTN, VoIP
    /// </summary>
    public String transport;

    /// <summary>
    /// Information about extension on whose behalf a call is initiated. For Secretary call log the Boss extension info is returned
    /// </summary>
    public ActiveCallsRecordExtensionInfo extension;

    /// <summary>
    /// Information on a delegate extension that actually implemented a call action. For Secretary call log the field is returned if the current extension implemented a call. For Boss call log the field contains information on a Secretary extension which actually implemented a call on behalf of the current extension
    /// </summary>
    public DelegateInfo delegate;

    /// <summary>
    /// For 'Detailed' view only. Leg description
    /// Required
    /// </summary>
    public CallLogRecordLegInfo[] legs;

    /// <summary>
    /// </summary>
    public CallLogRecordMessage message;

    /// <summary>
    /// Returned only if this call was deleted. Value is set to 'True' in this case
    /// </summary>
    public Boolean deleted;
}
