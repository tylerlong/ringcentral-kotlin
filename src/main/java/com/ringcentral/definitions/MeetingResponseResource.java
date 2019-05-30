package com.ringcentral.definitions;


public class MeetingResponseResource {
    /// <summary>
    /// </summary>
    public String uri;

    /// <summary>
    /// </summary>
    public String uuid;

    /// <summary>
    /// </summary>
    public String id;

    /// <summary>
    /// </summary>
    public String topic;

    /// <summary>
    /// </summary>
    public String meetingType;

    /// <summary>
    /// </summary>
    public String password;

    /// <summary>
    /// </summary>
    public String h323Password;

    /// <summary>
    /// </summary>
    public String status;

    /// <summary>
    /// </summary>
    public MeetingLinks links;

    /// <summary>
    /// </summary>
    public MeetingScheduleResource schedule;

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
    public String[] audioOptions;
}
