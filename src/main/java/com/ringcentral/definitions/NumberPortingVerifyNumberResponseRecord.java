package com.ringcentral.definitions;


public class NumberPortingVerifyNumberResponseRecord {
    /// <summary>
    /// The verified phone number.
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Is phone number billing phone number or not.
    /// </summary>
    public Boolean isBillingNumber;

    /// <summary>
    /// The result of phone number validation, can or not be ported the phone number.
    /// Enum: Success, Failure
    /// </summary>
    public String validationStatus;

    /// <summary>
    /// The reason why the corresponding phone number can`t be ported.
    /// </summary>
    public String reason;
}
