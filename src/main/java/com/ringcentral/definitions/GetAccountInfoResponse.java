package com.ringcentral.definitions;


public class GetAccountInfoResponse {
    /// <summary>
    /// Internal identifier of an account
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of an account
    /// </summary>
    public String uri;

    /// <summary>
    /// Main phone number of the current account
    /// </summary>
    public String mainNumber;

    /// <summary>
    /// Operator's extension information. This extension will receive all calls and messages intended for the operator
    /// </summary>
    public GetExtensionInfoResponse operator;

    /// <summary>
    /// Additional account identifier, developed and applied by the client
    /// </summary>
    public String partnerId;

    /// <summary>
    /// Account service information, including brand, service plan and billing plan
    /// </summary>
    public ServiceInfo serviceInfo;

    /// <summary>
    /// Specifies account configuration wizard state (web service setup). The default value is 'NotStarted'
    /// Enum: NotStarted, Incomplete, Completed
    /// </summary>
    public String setupWizardState;

    /// <summary>
    /// Status of the current account
    /// Enum: Confirmed, Disabled
    /// </summary>
    public String status;

    /// <summary>
    /// Status information (reason, comment, lifetime). Returned for 'Disabled' status only
    /// </summary>
    public AccountStatusInfo statusInfo;

    /// <summary>
    /// Account level region data (web service Auto-Receptionist settings)
    /// </summary>
    public RegionalSettings regionalSettings;

    /// <summary>
    /// Specifies whether an account is included into any federation of accounts or not
    /// </summary>
    public Boolean federated;

    /// <summary>
    /// If outbound call prefix is not specified, or set to null (0), then the parameter is not returned; the supported value range is 2-9
    /// </summary>
    public Long outboundCallPrefix;

    /// <summary>
    /// Customer facing identifier. Returned for accounts with the turned off PBX features. Equals to main company number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (without '+' sign)format
    /// </summary>
    public String cfid;

    /// <summary>
    /// Limits which are effective for the account
    /// </summary>
    public AccountLimits limits;
}
