package com.ringcentral.definitions;


public class GlipEventInfo {
    /**
     * Internal identifier of an event
     */
    public String id;

    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;

    /**
     * Event title
     */
    public String title;

    /**
     * Datetime of starting an event
     */
    public String startTime;

    /**
     * Datetime of ending an event
     */
    public String endTime;

    /**
     * Indicates whether an event has some specific time slot or lasts for the whole day(s)
     */
    public Boolean allDay;

    /**
     * Event recurrence settings
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;

    /**
     * Condition of ending
     */
    public String endingCondition;

    /**
     * Count of iterations. For periodic events only
     */
    public Long endingAfter;

    /**
     * Iterations end datetime for periodic events
     * Default: None
     * Enum: None, Count, Date
     */
    public String endingOn;

    /**
     * Color of Event title (including its presentation in Calendar)
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;

    /**
     * Event location
     */
    public String location;

    /**
     * Event details
     */
    public String description;
}
