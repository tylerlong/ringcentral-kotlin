package com.ringcentral.definitions;


public class GetAccountInfoResponse {
    /**
     * Internal identifier of an account
     */
    public String id;

    /**
     * Canonical URI of an account
     */
    public String uri;

    /**
     * Main phone number of the current account
     */
    public String mainNumber;

    /**
     * Operator's extension information. This extension will receive all calls and messages intended for the operator
     */
    public GetExtensionInfoResponse operator;

    /**
     * Additional account identifier, developed and applied by the client
     */
    public String partnerId;

    /**
     * Account service information, including brand, service plan and billing plan
     */
    public ServiceInfo serviceInfo;

    /**
     * Specifies account configuration wizard state (web service setup). The default value is 'NotStarted'
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;

    /**
     * Status of the current account
     * Enum: Confirmed, Disabled
     */
    public String status;

    /**
     * Status information (reason, comment, lifetime). Returned for 'Disabled' status only
     */
    public AccountStatusInfo statusInfo;

    /**
     * Account level region data (web service Auto-Receptionist settings)
     */
    public RegionalSettings regionalSettings;

    /**
     * Specifies whether an account is included into any federation of accounts or not
     */
    public Boolean federated;

    /**
     * If outbound call prefix is not specified, or set to null (0), then the parameter is not returned; the supported value range is 2-9
     */
    public Long outboundCallPrefix;

    /**
     * Customer facing identifier. Returned for accounts with the turned off PBX features. Equals to main company number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (without '+' sign)format
     */
    public String cfid;

    /**
     * Limits which are effective for the account
     */
    public AccountLimits limits;
}
