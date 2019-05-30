package com.ringcentral.definitions;


public class MeetingRequestResource {
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
    public MeetingScheduleResource schedule;

    /**
     *
     */
    public String password;

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
    public Boolean usePersonalMeetingId;

    /**
     *
     */
    public String[] audioOptions;
}
