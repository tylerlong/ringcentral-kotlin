package com.ringcentral.definitions;


public class GlipEventCreate {
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
    /// Required
    /// </summary>
    public String title;

    /// <summary>
    /// Datetime of starting an event
    /// Required
    /// </summary>
    public String startTime;

    /// <summary>
    /// Datetime of ending an event
    /// Required
    /// </summary>
    public String endTime;

    /// <summary>
    /// Indicates whether event has some specific time slot or lasts for whole day(s)
    /// </summary>
    public Boolean allDay;

    /// <summary>
    /// Event recurrence settings. For non-periodic events the value is 'None'. Must be greater or equal to event duration: 1- Day/Weekday; 7 - Week; 28 - Month; 365 - Year
    /// Enum: None, Day, Weekday, Week, Month, Year
    /// </summary>
    public String recurrence;

    /// <summary>
    /// Condition of ending
    /// </summary>
    public String endingCondition;

    /// <summary>
    /// Count of iterations. For periodic events only. Value range is 1 - 10. Must be specified if 'endingCondition' is 'Count'
    /// </summary>
    public Long endingAfter;

    /// <summary>
    /// Iterations end datetime for periodic events.
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
