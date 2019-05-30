package com.ringcentral.definitions;


public class MeetingResponseResource {
    /**
     *
     */
    public String uri;

    /**
     *
     */
    public String uuid;

    /**
     *
     */
    public String id;

    /**
     *
     */
    public String topic;

    /**
     *
     */
    public String meetingType;

    /**
     *
     */
    public String password;

    /**
     *
     */
    public String h323Password;

    /**
     *
     */
    public String status;

    /**
     *
     */
    public MeetingLinks links;

    /**
     *
     */
    public MeetingScheduleResource schedule;

    /**
     *
     */
    public HostInfoRequest host;

    /**
     *
     */
    public Boolean allowJoinBeforeHost;

    /**
     *
     */
    public Boolean startHostVideo;

    /**
     *
     */
    public Boolean startParticipantsVideo;

    /**
     *
     */
    public String[] audioOptions;
}
