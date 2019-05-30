package com.ringcentral.definitions;


public class GlipCreatePost {
    /**
     * Title of a message. (Can be set for bot's messages only).
     */
    public String title;

    /**
     * Text of a post
     * Maximum: 1000
     */
    public String text;

    /**
     * Internal identifier of a group
     */
    public String groupId;

    /**
     * List of attachments to be posted
     */
    public GlipMessageAttachmentInfoRequest[] attachments;
}
