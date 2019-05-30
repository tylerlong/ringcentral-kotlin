package com.ringcentral.definitions;


public class MessageAttachmentInfo {
    /// <summary>
    /// Internal identifier of a message attachment
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a message attachment
    /// </summary>
    public String uri;

    /// <summary>
    /// Type of message attachment
    /// Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
    /// </summary>
    public String type;

    /// <summary>
    /// MIME type for a given attachment, for instance 'audio/wav'
    /// </summary>
    public String contentType;

    /// <summary>
    /// Supported for `Voicemail` only. Duration of a voicemail in seconds
    /// </summary>
    public Long vmDuration;

    /// <summary>
    /// Name of a file attached
    /// </summary>
    public String filename;

    /// <summary>
    /// Size of attachment in bytes
    /// </summary>
    public Long size;
}
