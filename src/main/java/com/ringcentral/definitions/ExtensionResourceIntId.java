package com.ringcentral.definitions;


public class ExtensionResourceIntId {
    /**
     *
     */
    public String uri;

    /**
     *
     */
    public Long id;

    /**
     *
     */
    public String partnerId;

    /**
     *
     */
    public String extensionNumber;

    /**
     *
     */
    public String loginName;

    /**
     *
     */
    public ExtensionContactInfo contact;

    /**
     *
     */
    public Reference[] references;

    /**
     *
     */
    public String name;

    /**
     * Enum: Unknown, User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation
     */
    public String type;

    /**
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String status;

    /**
     *
     */
    public StatusInfo statusInfo;

    /**
     *
     */
    public DepartmentResource[] departments;

    /**
     *
     */
    public ServiceFeatureValue[] serviceFeatures;

    /**
     *
     */
    public RegionalSettingsInfo regionalSettings;

    /**
     * Enum: NotStarted, Incomplete, Completed, Unknown
     */
    public String setupWizardState;

    /**
     *
     */
    public ExtensionPermissionsResource permissions;

    /**
     *
     */
    public String password;

    /**
     *
     */
    public String ivrPin;

    /**
     *
     */
    public ProfileImageResource profileImage;
}
