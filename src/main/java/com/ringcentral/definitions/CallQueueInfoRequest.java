package com.ringcentral.definitions;


public class CallQueueInfoRequest {
    /// <summary>
    /// Target percentage of calls that must be answered by agents within the service level time threshold
    /// </summary>
    public Long slaGoal;

    /// <summary>
    /// </summary>
    public Long slaThresholdSeconds;

    /// <summary>
    /// </summary>
    public Boolean includeAbandonedCalls;

    /// <summary>
    /// </summary>
    public Long abandonedThresholdSeconds;
}
