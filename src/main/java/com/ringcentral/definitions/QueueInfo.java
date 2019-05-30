package com.ringcentral.definitions;


public class QueueInfo {
    /// <summary>
    /// Specifies how calls are transferred to group members
    /// Enum: Rotating, Simultaneous, FixedOrder
    /// </summary>
    public String transferMode;

    /// <summary>
    /// Information on a call forwarding rule
    /// </summary>
    public FixedOrderAgents[] fixedOrderAgents;

    /// <summary>
    /// Connecting audio interruption mode
    /// Enum: Never, WhenMusicEnds, Periodically
    /// </summary>
    public String holdAudioInterruptionMode;

    /// <summary>
    /// Connecting audio interruption message period in seconds
    /// </summary>
    public Long holdAudioInterruptionPeriod;

    /// <summary>
    /// Maximum time in seconds to wait for a call queue member before trying the next member
    /// </summary>
    public Long agentTimeout;

    /// <summary>
    /// Minimum post-call wrap up time in seconds before agent status is automatically set
    /// </summary>
    public Long wrapUpTime;

    /// <summary>
    /// Maximum hold time in seconds to wait for an available call queue member
    /// </summary>
    public Long holdTime;

    /// <summary>
    /// Maximum count of callers on hold
    /// </summary>
    public Long maxCallers;

    /// <summary>
    /// Action which should be taken if count of callers on hold exceeds the maximum
    /// Enum: Voicemail, Announcement
    /// </summary>
    public String maxCallersAction;
}
