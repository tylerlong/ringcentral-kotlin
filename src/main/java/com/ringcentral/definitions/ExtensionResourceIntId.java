package com.ringcentral.definitions;


public class ExtensionResourceIntId {
    /// <summary>
    /// </summary>
    public String uri;

    /// <summary>
    /// </summary>
    public Long id;

    /// <summary>
    /// </summary>
    public String partnerId;

    /// <summary>
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// </summary>
    public String loginName;

    /// <summary>
    /// </summary>
    public ExtensionContactInfo contact;

    /// <summary>
    /// </summary>
    public Reference[] references;

    /// <summary>
    /// </summary>
    public String name;

    /// <summary>
    /// Enum: Unknown, User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation
    /// </summary>
    public String type;

    /// <summary>
    /// Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
    /// </summary>
    public String status;

    /// <summary>
    /// </summary>
    public StatusInfo statusInfo;

    /// <summary>
    /// </summary>
    public DepartmentResource[] departments;

    /// <summary>
    /// </summary>
    public ServiceFeatureValue[] serviceFeatures;

    /// <summary>
    /// </summary>
    public RegionalSettingsInfo regionalSettings;

    /// <summary>
    /// Enum: NotStarted, Incomplete, Completed, Unknown
    /// </summary>
    public String setupWizardState;

    /// <summary>
    /// </summary>
    public ExtensionPermissionsResource permissions;

    /// <summary>
    /// </summary>
    public String password;

    /// <summary>
    /// </summary>
    public String ivrPin;

    /// <summary>
    /// </summary>
    public ProfileImageResource profileImage;
}
