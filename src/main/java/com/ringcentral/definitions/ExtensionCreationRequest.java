package com.ringcentral.definitions;


public class ExtensionCreationRequest {
    /**
     * Contact Information
     * Required
     */
    public ContactInfoCreationRequest contact;

    /**
     * Number of extension
     */
    public String extensionNumber;

    /**
     * Password for extension. If not specified, the password is auto-generated
     */
    public String password;

    /**
     * List of non-RC internal identifiers assigned to an extension
     */
    public ReferenceInfo[] references;

    /**
     *
     */
    public Roles[] roles;

    /**
     * Extension region data (timezone, home country, language)
     */
    public RegionalSettings regionalSettings;

    /**
     * Specifies extension configuration wizard state (web service setup).
     * Default: NotStarted
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;

    /**
     * Extension current state
     * Enum: Enabled, Disabled, NotActivated, Unassigned
     */
    public String status;

    /**
     * Status information (reason, comment). For 'Disabled' status only
     */
    public ExtensionStatusInfo statusInfo;

    /**
     * Extension type
     * Required
     * Enum: User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnlyGroup, ParkLocation
     */
    public String type;

    /**
     * Hides extension from showing in company directory. Supported for extensions of User type only. For unassigned extensions the value is set to 'True' by default. For assigned extensions the value is set to 'False' by default
     */
    public Boolean hidden;
}
