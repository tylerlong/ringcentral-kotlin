package com.ringcentral.definitions;


public class PersonalContactResource {
    /// <summary>
    /// Canonical URI of the contact
    /// </summary>
    public String uri;

    /// <summary>
    /// This property has a special meaning only on Address Book Sync (e.g. a contact can be `Deleted`). For simple contact list reading it has always the default value - `Alive`
    /// Enum: Alive, Deleted, Purged
    /// </summary>
    public String availability;

    /// <summary>
    /// Email of the contact
    /// </summary>
    public String email;

    /// <summary>
    /// </summary>
    public String id;

    /// <summary>
    /// Notes for the contact
    /// </summary>
    public String notes;

    /// <summary>
    /// Company name of the contact
    /// </summary>
    public String company;

    /// <summary>
    /// First name of the contact
    /// </summary>
    public String firstName;

    /// <summary>
    /// Last name of the contact
    /// </summary>
    public String lastName;

    /// <summary>
    /// Job title of the contact
    /// </summary>
    public String jobTitle;

    /// <summary>
    /// Date of birth of the contact
    /// </summary>
    public String birthday;

    /// <summary>
    /// The contact home page URL
    /// </summary>
    public String webPage;

    /// <summary>
    /// Middle name of the contact
    /// </summary>
    public String middleName;

    /// <summary>
    /// Nick name of the contact
    /// </summary>
    public String nickName;

    /// <summary>
    /// 2nd email of the contact
    /// </summary>
    public String email2;

    /// <summary>
    /// 3rd email of the contact
    /// </summary>
    public String email3;

    /// <summary>
    /// Home phone number of the contact in e.164 (with "+") format
    /// </summary>
    public String homePhone;

    /// <summary>
    /// 2nd home phone number of the contact in e.164 (with "+") format
    /// </summary>
    public String homePhone2;

    /// <summary>
    /// Business phone of the contact in e.164 (with "+") format
    /// </summary>
    public String businessPhone;

    /// <summary>
    /// 2nd business phone of the contact in e.164 (with "+") format
    /// </summary>
    public String businessPhone2;

    /// <summary>
    /// Mobile phone of the contact in e.164 (with "+") format
    /// </summary>
    public String mobilePhone;

    /// <summary>
    /// Business fax number of the contact in e.164 (with "+") format
    /// </summary>
    public String businessFax;

    /// <summary>
    /// Company number of the contact in e.164 (with "+") format
    /// </summary>
    public String companyPhone;

    /// <summary>
    /// Phone number of the contact assistant in e.164 (with "+") format
    /// </summary>
    public String assistantPhone;

    /// <summary>
    /// Car phone number of the contact in e.164 (with "+") format
    /// </summary>
    public String carPhone;

    /// <summary>
    /// Other phone number of the contact in e.164 (with "+") format
    /// </summary>
    public String otherPhone;

    /// <summary>
    /// Other fax number of the contact in e.164 (with "+") format
    /// </summary>
    public String otherFax;

    /// <summary>
    /// Callback phone number of the contact in e.164 (with "+") format
    /// </summary>
    public String callbackPhone;

    /// <summary>
    /// </summary>
    public ContactAddressInfo businessAddress;

    /// <summary>
    /// </summary>
    public ContactAddressInfo homeAddress;

    /// <summary>
    /// </summary>
    public ContactAddressInfo otherAddress;
}
