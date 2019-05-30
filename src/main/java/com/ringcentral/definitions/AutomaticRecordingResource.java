package com.ringcentral.definitions;


public class AutomaticRecordingResource {
    /// <summary>
    /// Flag for controling Automatic Call Recording settings
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Flag for controlling 'Play Call Recording Announcement for Outbound Calls' settings
    /// </summary>
    public Boolean outboundCallTones;

    /// <summary>
    /// Flag for controlling 'Play periodic tones for outbound calls' settings
    /// </summary>
    public Boolean outboundCallAnnouncement;

    /// <summary>
    /// Flag for controlling 'Allow mute in auto call recording' settings
    /// </summary>
    public Boolean allowMute;

    /// <summary>
    /// Total amount of extension that are used in call recordings
    /// </summary>
    public Long extensionCount;
}
