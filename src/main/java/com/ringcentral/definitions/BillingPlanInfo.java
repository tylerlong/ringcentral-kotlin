package com.ringcentral.definitions;


public class BillingPlanInfo {
    /**
     * Internal identifier of a billing plan
     */
    public String id;

    /**
     * Billing plan name
     */
    public String name;

    /**
     * Duration period
     * Enum: Month, Day
     */
    public String durationUnit;

    /**
     * Number of duration units
     */
    public String duration;

    /**
     * Billing plan type
     * Enum: Initial, Regular, Suspended, Trial, TrialNoCC, Free
     */
    public String type;
}
