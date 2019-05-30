package com.ringcentral.definitions;


public class GlipMessageAttachmentInfoRequest {
    /// <summary>
    /// Type of attachment
    /// Default: Card
    /// Enum: Card, Event, Note
    /// </summary>
    public String type;

    /// <summary>
    /// Attachment title
    /// </summary>
    public String title;

    /// <summary>
    /// Default message returned in case the client does not support interactive messages
    /// </summary>
    public String fallback;

    /// <summary>
    /// Color of Event title, including its presentation in Calendar; or the color of the side border of an interactive message of a Card. The default color is 'Black'
    /// </summary>
    public String color;

    /// <summary>
    /// Introductory text displayed directly above a message
    /// </summary>
    public String intro;

    /// <summary>
    /// Information about the author
    /// </summary>
    public GlipMessageAttachmentAuthorInfo author;

    /// <summary>
    /// Text of attachment (up to 1000 chars), supports GlipDown
    /// </summary>
    public String text;

    /// <summary>
    /// Link to an image displayed at the bottom of a message
    /// </summary>
    public String imageUri;

    /// <summary>
    /// Link to an image preview displayed to the right of a message (82x82)
    /// </summary>
    public String thumbnailUri;

    /// <summary>
    /// Individual subsections within a message
    /// </summary>
    public GlipMessageAttachmentFieldsInfo[] fields;

    /// <summary>
    /// Message footer information
    /// </summary>
    public GlipMessageAttachmentFootnoteInfo footnote;

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
    /// Event recurrence settings. For non-periodic events the value is 'None'. Must be greater or equal to event duration: 1- Day/Weekday; 7 - Week; 28 - Month; 365 - Year
    /// Enum: None, Day, Weekday, Week, Month, Year
    /// </summary>
    public String recurrence;

    /// <summary>
    /// Condition of ending an event
    /// </summary>
    public String endingCondition;
}
