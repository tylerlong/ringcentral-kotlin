package com.ringcentral.definitions;


public class ExtensionCreationRequest {
    /// <summary>
    /// Contact Information
    /// Required
    /// </summary>
    public ContactInfoCreationRequest contact;

    /// <summary>
    /// Number of extension
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// Password for extension. If not specified, the password is auto-generated
    /// </summary>
    public String password;

    /// <summary>
    /// List of non-RC internal identifiers assigned to an extension
    /// </summary>
    public ReferenceInfo[] references;

    /// <summary>
    /// </summary>
    public Roles[] roles;

    /// <summary>
    /// Extension region data (timezone, home country, language)
    /// </summary>
    public RegionalSettings regionalSettings;

    /// <summary>
    /// Specifies extension configuration wizard state (web service setup).
    /// Default: NotStarted
    /// Enum: NotStarted, Incomplete, Completed
    /// </summary>
    public String setupWizardState;

    /// <summary>
    /// Extension current state
    /// Enum: Enabled, Disabled, NotActivated, Unassigned
    /// </summary>
    public String status;

    /// <summary>
    /// Status information (reason, comment). For 'Disabled' status only
    /// </summary>
    public ExtensionStatusInfo statusInfo;

    /// <summary>
    /// Extension type
    /// Required
    /// Enum: User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnlyGroup, ParkLocation
    /// </summary>
    public String type;

    /// <summary>
    /// Hides extension from showing in company directory. Supported for extensions of User type only. For unassigned extensions the value is set to 'True' by default. For assigned extensions the value is set to 'False' by default
    /// </summary>
    public Boolean hidden;
}
