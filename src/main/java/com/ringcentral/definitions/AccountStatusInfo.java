package com.ringcentral.definitions;


public class AccountStatusInfo {
    /**
     * A free-form user comment, describing the status change reason
     */
    public String comment;

    /**
     * Type of suspension
     * Enum: Voluntarily, Involuntarily
     */
    public String reason;

    /**
     * Date until which the account will get deleted. The default value is 30 days since current date
     */
    public String till;
}
