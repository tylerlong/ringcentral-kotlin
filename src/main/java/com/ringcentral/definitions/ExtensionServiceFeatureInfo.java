package com.ringcentral.definitions;


public class ExtensionServiceFeatureInfo {
    /// <summary>
    /// Feature status; shows feature availability for an extension
    /// </summary>
    public Boolean enabled;

    /// <summary>
    /// Feature name
    /// Enum: AccountFederation, Archiver, AutomaticCallRecordingMute, AutomaticInboundCallRecording, AutomaticOutboundCallRecording, BlockedMessageForwarding, Calendar, CallerIdControl, CallForwarding, CallPark, CallParkLocations, CallSupervision, CallSwitch, CallQualitySurvey, Conferencing, ConfigureDelegates, DeveloperPortal, DND, DynamicConference, EmergencyAddressAutoUpdate, EmergencyCalling, EncryptionAtRest, ExternalDirectoryIntegration, Fax, FaxReceiving, FreeSoftPhoneLines, HDVoice, HipaaCompliance, Intercom, InternationalCalling, InternationalSMS, LinkedSoftphoneLines, MMS, OnDemandCallRecording, Pager, PagerReceiving, Paging, PasswordAuth, PromoMessage, Reports, Presence, RCTeams, RingOut, SalesForce, SharedLines, SingleExtensionUI, SiteCodes, SMS, SMSReceiving, SoftPhoneUpdate, TelephonySessions, UserManagement, VideoConferencing, VoipCalling, VoipCallingOnMobile, Voicemail, VoicemailToText, WebPhone
    /// </summary>
    public String featureName;

    /// <summary>
    /// Reason of limitation for a particular service feature. Returned only if the enabled parameter value is 'False', see Service Feature Limitations and Reasons. When retrieving service features for an extension, the reasons for the limitations, if any, are returned in response
    /// </summary>
    public String reason;
}
