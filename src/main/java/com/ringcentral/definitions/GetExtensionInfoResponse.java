package com.ringcentral.definitions;


public class GetExtensionInfoResponse {
    /// <summary>
    /// Internal identifier of an extension
    /// Required
    /// </summary>
    public Long id;

    /// <summary>
    /// Canonical URI of an extension
    /// Required
    /// </summary>
    public String uri;

    /// <summary>
    /// Contact detailed information
    /// </summary>
    public ContactInfo contact;

    /// <summary>
    /// Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId
    /// </summary>
    public DepartmentInfo[] departments;

    /// <summary>
    /// Number of department extension
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// Extension user name
    /// </summary>
    public String name;

    /// <summary>
    /// For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
    /// </summary>
    public String partnerId;

    /// <summary>
    /// </summary>
    public ExtensionPermissions permissions;

    /// <summary>
    /// Information on profile image
    /// Required
    /// </summary>
    public ProfileImageInfo profileImage;

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
    /// Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features
    /// </summary>
    public ExtensionServiceFeatureInfo[] serviceFeatures;

    /// <summary>
    /// Specifies extension configuration wizard state (web service setup).
    /// Default: NotStarted
    /// Enum: NotStarted, Incomplete, Completed
    /// </summary>
    public String setupWizardState;

    /// <summary>
    /// Extension current state. If the status is 'Unassigned'. Returned for all extensions
    /// Required
    /// Enum: Enabled, Disabled, NotActivated, Unassigned
    /// </summary>
    public String status;

    /// <summary>
    /// Status information (reason, comment). Returned for 'Disabled' status only
    /// </summary>
    public ExtensionStatusInfo statusInfo;

    /// <summary>
    /// Extension type
    /// Required
    /// Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnlyGroup, IvrMenu, ApplicationExtension, ParkLocation
    /// </summary>
    public String type;

    /// <summary>
    /// For Department extension type only. Call queue settings
    /// </summary>
    public CallQueueExtensionInfo callQueueExtensionInfo;

    /// <summary>
    /// Hides extension from showing in company directory. Supported for extensions of User type only
    /// </summary>
    public Boolean hidden;
}
