package com.ringcentral.definitions;


public class NumberPortingVerifyNumberResponseRecord {
    /**
     * The verified phone number.
     */
    public String phoneNumber;

    /**
     * Is phone number billing phone number or not.
     */
    public Boolean isBillingNumber;

    /**
     * The result of phone number validation, can or not be ported the phone number.
     * Enum: Success, Failure
     */
    public String validationStatus;

    /**
     * The reason why the corresponding phone number can`t be ported.
     */
    public String reason;
}
