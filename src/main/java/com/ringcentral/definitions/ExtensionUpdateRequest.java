package com.ringcentral.definitions;


public class ExtensionUpdateRequest {
    /**
     * Enum: Disabled, Enabled, NotActivated
     */
    public String status;

    /**
     *
     */
    public ExtensionStatusInfo statusInfo;

    /**
     * Type of suspension
     */
    public String reason;

    /**
     * Free Form user comment
     */
    public String comment;

    /**
     * Extension number available
     */
    public String extensionNumber;

    /**
     *
     */
    public ContactInfoUpdateRequest contact;

    /**
     *
     */
    public ExtensionRegionalSettingRequest regionalSettings;

    /**
     * Enum: NotStarted, Incomplete, Completed
     */
    public String setupWizardState;

    /**
     * Extension partner identifier
     */
    public String partnerId;

    /**
     * IVR PIN
     */
    public String ivrPin;

    /**
     * Password for extension
     */
    public String password;

    /**
     * For Department extension type only. Call queue settings
     */
    public CallQueueInfoRequest callQueueInfo;

    /**
     *
     */
    public UserTransitionInfo[] transition;
}
