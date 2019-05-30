package com.ringcentral.definitions;


public class GlipMessageAttachmentInfo {
    /// <summary>
    /// Internal identifier of an attachment
    /// </summary>
    public String id;

    /// <summary>
    /// Type of an attachment
    /// Default: Card
    /// Enum: Card, Event, Note
    /// </summary>
    public String type;

    /// <summary>
    /// A string of default text that will be rendered in the case that the client does not support Interactive Messages
    /// </summary>
    public String fallback;

    /// <summary>
    /// A pretext to the message
    /// </summary>
    public String intro;

    /// <summary>
    /// Information about the author
    /// </summary>
    public GlipMessageAttachmentAuthorInfo author;

    /// <summary>
    /// Message title
    /// </summary>
    public String title;

    /// <summary>
    /// A large string field (up to 1000 chars) to be displayed as the body of a message (Supports GlipDown)
    /// </summary>
    public String text;

    /// <summary>
    /// url used to display a single image at the bottom of a message
    /// </summary>
    public String imageUri;

    /// <summary>
    /// url used to display a thumbnail to the right of a message (82x82)
    /// </summary>
    public String thumbnailUri;

    /// <summary>
    /// Information on navigation
    /// </summary>
    public GlipMessageAttachmentFieldsInfo[] fields;

    /// <summary>
    /// Message Footer
    /// </summary>
    public GlipMessageAttachmentFootnoteInfo footnote;

    /// <summary>
    /// Internal identifier of a person created an event
    /// </summary>
    public String creatorId;

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
    /// Event recurrence settings.
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
    /// Color of Event title, including its presentation in Calendar; or the color of the side border of an interactive message of a Card
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
