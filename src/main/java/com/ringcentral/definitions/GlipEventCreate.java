package com.ringcentral.definitions;


public class GlipEventCreate {
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
     * Required
     */
    public String title;

    /**
     * Datetime of starting an event
     * Required
     */
    public String startTime;

    /**
     * Datetime of ending an event
     * Required
     */
    public String endTime;

    /**
     * Indicates whether event has some specific time slot or lasts for whole day(s)
     */
    public Boolean allDay;

    /**
     * Event recurrence settings. For non-periodic events the value is 'None'. Must be greater or equal to event duration: 1- Day/Weekday; 7 - Week; 28 - Month; 365 - Year
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;

    /**
     * Condition of ending
     */
    public String endingCondition;

    /**
     * Count of iterations. For periodic events only. Value range is 1 - 10. Must be specified if 'endingCondition' is 'Count'
     */
    public Long endingAfter;

    /**
     * Iterations end datetime for periodic events.
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
