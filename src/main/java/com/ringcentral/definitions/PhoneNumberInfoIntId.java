package com.ringcentral.definitions;


public class PhoneNumberInfoIntId {
    /// <summary>
    /// Internal identifier of a phone number
    /// </summary>
    public Long id;

    /// <summary>
    /// Brief information on a phone number country
    /// </summary>
    public PhoneNumberCountryInfo country;

    /// <summary>
    /// Information on the extension, to which the phone number is assigned. Returned only for the request of Account phone number list
    /// </summary>
    public ExtensionInfo extension;

    /// <summary>
    /// Custom user name of a phone number, if any
    /// </summary>
    public String label;

    /// <summary>
    /// Location (City, State). Filled for local US numbers
    /// </summary>
    public String location;

    /// <summary>
    /// Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
    /// Enum: External, TollFree, Local
    /// </summary>
    public String paymentType;

    /// <summary>
    /// Phone number
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
    /// </summary>
    public String status;

    /// <summary>
    /// Phone number type
    /// Enum: VoiceFax, FaxOnly, VoiceOnly
    /// </summary>
    public String type;

    /// <summary>
    /// Usage type of the phone number
    /// Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
    /// </summary>
    public String usageType;
}
