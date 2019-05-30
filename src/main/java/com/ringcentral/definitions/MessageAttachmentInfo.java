package com.ringcentral.definitions;


public class MessageAttachmentInfo {
    /**
     * Internal identifier of a message attachment
     */
    public String id;

    /**
     * Canonical URI of a message attachment
     */
    public String uri;

    /**
     * Type of message attachment
     * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
     */
    public String type;

    /**
     * MIME type for a given attachment, for instance 'audio/wav'
     */
    public String contentType;

    /**
     * Supported for `Voicemail` only. Duration of a voicemail in seconds
     */
    public Long vmDuration;

    /**
     * Name of a file attached
     */
    public String filename;

    /**
     * Size of attachment in bytes
     */
    public Long size;
}
