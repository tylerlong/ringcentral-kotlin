package com.ringcentral.definitions;


public class BillingPlanInfo {
    /// <summary>
    /// Internal identifier of a billing plan
    /// </summary>
    public String id;

    /// <summary>
    /// Billing plan name
    /// </summary>
    public String name;

    /// <summary>
    /// Duration period
    /// Enum: Month, Day
    /// </summary>
    public String durationUnit;

    /// <summary>
    /// Number of duration units
    /// </summary>
    public String duration;

    /// <summary>
    /// Billing plan type
    /// Enum: Initial, Regular, Suspended, Trial, TrialNoCC, Free
    /// </summary>
    public String type;
}
