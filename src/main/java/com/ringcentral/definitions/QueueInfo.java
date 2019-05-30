package com.ringcentral.definitions;


public class QueueInfo {
    /**
     * Specifies how calls are transferred to group members
     * Enum: Rotating, Simultaneous, FixedOrder
     */
    public String transferMode;

    /**
     * Information on a call forwarding rule
     */
    public FixedOrderAgents[] fixedOrderAgents;

    /**
     * Connecting audio interruption mode
     * Enum: Never, WhenMusicEnds, Periodically
     */
    public String holdAudioInterruptionMode;

    /**
     * Connecting audio interruption message period in seconds
     */
    public Long holdAudioInterruptionPeriod;

    /**
     * Maximum time in seconds to wait for a call queue member before trying the next member
     */
    public Long agentTimeout;

    /**
     * Minimum post-call wrap up time in seconds before agent status is automatically set
     */
    public Long wrapUpTime;

    /**
     * Maximum hold time in seconds to wait for an available call queue member
     */
    public Long holdTime;

    /**
     * Maximum count of callers on hold
     */
    public Long maxCallers;

    /**
     * Action which should be taken if count of callers on hold exceeds the maximum
     * Enum: Voicemail, Announcement
     */
    public String maxCallersAction;
}
