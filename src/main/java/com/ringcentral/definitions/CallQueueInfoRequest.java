package com.ringcentral.definitions;


public class CallQueueInfoRequest {
    /**
     * Target percentage of calls that must be answered by agents within the service level time threshold
     */
    public Long slaGoal;

    /**
     *
     */
    public Long slaThresholdSeconds;

    /**
     *
     */
    public Boolean includeAbandonedCalls;

    /**
     *
     */
    public Long abandonedThresholdSeconds;
}
