package com.ringcentral.definitions;


public class ListStandardGreetingsParameters {
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted.
     * Default: 1
     */
    public Long page;

    /**
     * Indicates the page size (number of items).
     * Default: 100
     */
    public Long perPage;

    /**
     * Type of a greeting, specifying the case when the greeting is played
     * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic, Company
     */
    public String type;

    /**
     * Usage type of a greeting, specifying if the greeting is applied for user extension or department extension
     * Enum: UserExtensionAnsweringRule, ExtensionAnsweringRule, DepartmentExtensionAnsweringRule, CompanyAnsweringRule, CompanyAfterHoursAnsweringRule, VoicemailExtensionAnsweringRule, AnnouncementExtensionAnsweringRule
     */
    public String usageType;
}
