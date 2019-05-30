package com.ringcentral.definitions;


public class GlipCreatePost {
    /// <summary>
    /// Title of a message. (Can be set for bot's messages only).
    /// </summary>
    public String title;

    /// <summary>
    /// Text of a post
    /// Maximum: 1000
    /// </summary>
    public String text;

    /// <summary>
    /// Internal identifier of a group
    /// </summary>
    public String groupId;

    /// <summary>
    /// List of attachments to be posted
    /// </summary>
    public GlipMessageAttachmentInfoRequest[] attachments;
}
