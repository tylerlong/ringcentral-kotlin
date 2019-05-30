package com.ringcentral.definitions;


public class NumberPortingVerifyNumberRequestRecord {
    /// <summary>
    /// Phone number to verify
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Is phone number billing phone number or not. Can be specified for one phone number only.
    /// </summary>
    public Boolean isBillingNumber;
}
