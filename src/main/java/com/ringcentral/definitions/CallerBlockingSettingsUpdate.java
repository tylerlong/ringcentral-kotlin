package com.ringcentral.definitions;


// Returns the lists of blocked and allowed phone numbers
public class CallerBlockingSettingsUpdate {
    /// <summary>
    /// Call blocking options: either specific or all calls and faxes
    /// Enum: Specific, All
    /// </summary>
    public String mode;

    /// <summary>
    /// Determines how to handle calls with no caller ID in 'Specific' mode
    /// Enum: BlockCallsAndFaxes, BlockFaxes, Allow
    /// </summary>
    public String noCallerId;

    /// <summary>
    /// Blocking settings for pay phones
    /// Enum: Block, Allow
    /// </summary>
    public String payPhones;

    /// <summary>
    /// List of greetings played for blocked callers
    /// </summary>
    public BlockedCallerGreetingInfo[] greetings;
}
