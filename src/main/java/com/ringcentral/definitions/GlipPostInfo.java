package com.ringcentral.definitions;


public class GlipPostInfo {
    /**
     * Internal identifier of a post
     */
    public String id;

    /**
     * Internal identifier of a group a post belongs to
     */
    public String groupId;

    /**
     * Type of a post
     * Enum: TextMessage, PersonJoined, PersonsAdded
     */
    public String type;

    /**
     * For 'TextMessage' post type only. Text of a message
     */
    public String text;

    /**
     * Internal identifier of a user - author of a post
     */
    public String creatorId;

    /**
     * For 'PersonsAdded' post type only. Identifiers of persons added to a group
     */
    public String[] addedPersonIds;

    /**
     * Post creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;

    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;

    /**
     * List of posted attachments
     */
    public GlipMessageAttachmentInfo[] attachments;

    /**
     *
     */
    public GlipMentionsInfo[] mentions;

    /**
     * Label of activity type
     */
    public String activity;

    /**
     * Title of a message. (Can be set for bot's messages only)
     */
    public String title;

    /**
     * Link to an image used as an icon for this message
     */
    public String iconUri;

    /**
     * Emoji used as an icon for this message
     */
    public String iconEmoji;
}
