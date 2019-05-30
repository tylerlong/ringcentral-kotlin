package com.ringcentral.definitions;


public class CompanyAnsweringRuleWeeklyScheduleInfoRequest {
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] monday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] tuesday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] wednesday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] thursday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] friday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] saturday;

    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] sunday;
}
