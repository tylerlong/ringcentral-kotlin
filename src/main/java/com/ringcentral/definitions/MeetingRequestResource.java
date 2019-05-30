package com.ringcentral.definitions;


public class MeetingRequestResource {
    /// <summary>
    /// </summary>
    public String topic;

    /// <summary>
    /// </summary>
    public String meetingType;

    /// <summary>
    /// </summary>
    public MeetingScheduleResource schedule;

    /// <summary>
    /// </summary>
    public String password;

    /// <summary>
    /// </summary>
    public HostInfoRequest host;

    /// <summary>
    /// </summary>
    public Boolean allowJoinBeforeHost;

    /// <summary>
    /// </summary>
    public Boolean startHostVideo;

    /// <summary>
    /// </summary>
    public Boolean startParticipantsVideo;

    /// <summary>
    /// </summary>
    public Boolean usePersonalMeetingId;

    /// <summary>
    /// </summary>
    public String[] audioOptions;
}
