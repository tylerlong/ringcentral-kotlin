package com.ringcentral.definitions;


public class UserPhoneNumberInfo {
    /**
     * Internal identifier of a phone number
     */
    public String id;

    /**
     * Brief information on a phone number country
     */
    public CountryInfo country;

    /**
     * Information on the extension, to which the phone number is assigned. Returned only for the request of Account phone number list
     */
    public ExtensionInfo extension;

    /**
     * Custom user name of a phone number, if any
     */
    public String label;

    /**
     * Location (City, State). Filled for local US numbers
     */
    public String location;

    /**
     * Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
     * Enum: External, TollFree, Local
     */
    public String paymentType;

    /**
     * Phone number
     */
    public String phoneNumber;

    /**
     * Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
     */
    public String status;

    /**
     * Phone number type
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;

    /**
     * Usage type of a phone number
     * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber
     */
    public String usageType;

    /**
     * List of features of a phone number
     */
    public String[] features;
}
