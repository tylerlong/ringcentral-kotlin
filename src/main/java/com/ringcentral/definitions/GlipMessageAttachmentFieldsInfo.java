package com.ringcentral.definitions;


public class GlipMessageAttachmentFieldsInfo {
    /// <summary>
    /// Title of an individual field
    /// </summary>
    public String title;

    /// <summary>
    /// Value of an individual field (supports Markdown)
    /// </summary>
    public String value;

    /// <summary>
    /// Style of width span applied to a field
    /// Default: Short
    /// Enum: Short, Long
    /// </summary>
    public String style;
}
