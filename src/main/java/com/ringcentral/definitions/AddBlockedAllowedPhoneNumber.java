package com.ringcentral.definitions;


// Updates either blocked or allowed phone number list with a new phone number.
public class AddBlockedAllowedPhoneNumber {
    /// <summary>
    /// A blocked/allowed phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Custom name of a blocked/allowed phone number
    /// </summary>
    public String label;

    /// <summary>
    /// Status of a phone number
    /// Default: Blocked
    /// Enum: Blocked, Allowed
    /// </summary>
    public String status;
}
