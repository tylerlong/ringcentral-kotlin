package com.ringcentral.definitions;


public class GlipMessageAttachmentFieldsInfo {
    /**
     * Title of an individual field
     */
    public String title;

    /**
     * Value of an individual field (supports Markdown)
     */
    public String value;

    /**
     * Style of width span applied to a field
     * Default: Short
     * Enum: Short, Long
     */
    public String style;
}
