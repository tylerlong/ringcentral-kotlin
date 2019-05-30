package com.ringcentral.definitions;


public class AccountStatusInfo {
    /// <summary>
    /// A free-form user comment, describing the status change reason
    /// </summary>
    public String comment;

    /// <summary>
    /// Type of suspension
    /// Enum: Voluntarily, Involuntarily
    /// </summary>
    public String reason;

    /// <summary>
    /// Date until which the account will get deleted. The default value is 30 days since current date
    /// </summary>
    public String till;
}
