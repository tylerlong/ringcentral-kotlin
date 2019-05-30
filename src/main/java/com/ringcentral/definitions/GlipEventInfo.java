package com.ringcentral.definitions;


public class GlipEventInfo {
    /// <summary>
    /// Internal identifier of an event
    /// </summary>
    public String id;

    /// <summary>
    /// Internal identifier of a person created an event
    /// </summary>
    public String creatorId;

    /// <summary>
    /// Event title
    /// </summary>
    public String title;

    /// <summary>
    /// Datetime of starting an event
    /// </summary>
    public String startTime;

    /// <summary>
    /// Datetime of ending an event
    /// </summary>
    public String endTime;

    /// <summary>
    /// Indicates whether an event has some specific time slot or lasts for the whole day(s)
    /// </summary>
    public Boolean allDay;

    /// <summary>
    /// Event recurrence settings
    /// Enum: None, Day, Weekday, Week, Month, Year
    /// </summary>
    public String recurrence;

    /// <summary>
    /// Condition of ending
    /// </summary>
    public String endingCondition;

    /// <summary>
    /// Count of iterations. For periodic events only
    /// </summary>
    public Long endingAfter;

    /// <summary>
    /// Iterations end datetime for periodic events
    /// Default: None
    /// Enum: None, Count, Date
    /// </summary>
    public String endingOn;

    /// <summary>
    /// Color of Event title (including its presentation in Calendar)
    /// Default: Black
    /// Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
    /// </summary>
    public String color;

    /// <summary>
    /// Event location
    /// </summary>
    public String location;

    /// <summary>
    /// Event details
    /// </summary>
    public String description;
}
