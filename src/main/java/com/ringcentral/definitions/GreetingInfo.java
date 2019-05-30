package com.ringcentral.definitions;


public class GreetingInfo {
    /// <summary>
    /// Type of a greeting, specifying the case when the greeting is played.
    /// Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, InterruptPrompt, HoldMusic, Custom, Company, BlockedCallersSpecific, BlockedCallersAll, BlockedNoCallerId, BlockedPayPhones, StartRecording, StopRecording, AutomaticRecording
    /// </summary>
    public String type;

    /// <summary>
    /// Usage type of a greeting, specifying if the greeting is applied to user extension or department extension.
    /// Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule
    /// </summary>
    public String usageType;

    /// <summary>
    /// </summary>
    public PresetInfo preset;
}
