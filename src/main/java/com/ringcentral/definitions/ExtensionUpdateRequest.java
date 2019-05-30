package com.ringcentral.definitions;


public class ExtensionUpdateRequest {
    /// <summary>
    /// Enum: Disabled, Enabled, NotActivated
    /// </summary>
    public String status;

    /// <summary>
    /// </summary>
    public ExtensionStatusInfo statusInfo;

    /// <summary>
    /// Type of suspension
    /// </summary>
    public String reason;

    /// <summary>
    /// Free Form user comment
    /// </summary>
    public String comment;

    /// <summary>
    /// Extension number available
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// </summary>
    public ContactInfoUpdateRequest contact;

    /// <summary>
    /// </summary>
    public ExtensionRegionalSettingRequest regionalSettings;

    /// <summary>
    /// Enum: NotStarted, Incomplete, Completed
    /// </summary>
    public String setupWizardState;

    /// <summary>
    /// Extension partner identifier
    /// </summary>
    public String partnerId;

    /// <summary>
    /// IVR PIN
    /// </summary>
    public String ivrPin;

    /// <summary>
    /// Password for extension
    /// </summary>
    public String password;

    /// <summary>
    /// For Department extension type only. Call queue settings
    /// </summary>
    public CallQueueInfoRequest callQueueInfo;

    /// <summary>
    /// </summary>
    public UserTransitionInfo[] transition;
}
