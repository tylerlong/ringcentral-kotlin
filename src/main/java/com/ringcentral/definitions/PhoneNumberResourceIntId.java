package com.ringcentral.definitions;


public class PhoneNumberResourceIntId {
    /// <summary>
    /// Internal identifier of a phone number
    /// </summary>
    public Long id;

    /// <summary>
    /// Brief information on a phone number country
    /// </summary>
    public CountryResource country;

    /// <summary>
    /// Information on an extension to which the phone number is assigned
    /// </summary>
    public PhoneNumberExtensionInfo extension;

    /// <summary>
    /// Custom user name of a phone number, if any
    /// </summary>
    public String label;

    /// <summary>
    /// Location (City, State). Filled for local US numbers
    /// </summary>
    public String location;

    /// <summary>
    /// Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system = ['External', 'TollFree', 'Local'],
    /// Enum: External, TollFree, Local
    /// </summary>
    public String paymentType;

    /// <summary>
    /// Phone number
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral ,
    /// </summary>
    public String status;

    /// <summary>
    /// Enum: CompanyNumber, MainCompanyNumber, AdditionalCompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
    /// </summary>
    public String usageType;

    /// <summary>
    /// Type of a phone number
    /// Enum: VoiceFax, FaxOnly, VoiceOnly
    /// </summary>
    public String type;

    /// <summary>
    /// Internal identifier of a phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time
    /// </summary>
    public String reservationId;
}
