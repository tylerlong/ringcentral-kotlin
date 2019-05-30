package com.ringcentral.definitions;


public class PersonalContactRequest {
    /// <summary>
    /// First name of the contact
    /// </summary>
    public String firstName;

    /// <summary>
    /// Last name of the contact
    /// </summary>
    public String lastName;

    /// <summary>
    /// Middle name of the contact
    /// </summary>
    public String middleName;

    /// <summary>
    /// Nick name of the contact
    /// </summary>
    public String nickName;

    /// <summary>
    /// Company name of the contact
    /// </summary>
    public String company;

    /// <summary>
    /// Job title of the contact
    /// </summary>
    public String jobTitle;

    /// <summary>
    /// Email of the contact
    /// </summary>
    public String email;

    /// <summary>
    /// 2nd email of the contact
    /// </summary>
    public String email2;

    /// <summary>
    /// 3rd email of the contact
    /// </summary>
    public String email3;

    /// <summary>
    /// Date of birth of the contact
    /// </summary>
    public String birthday;

    /// <summary>
    /// The contact home page URL
    /// </summary>
    public String webPage;

    /// <summary>
    /// Notes for the contact
    /// </summary>
    public String notes;

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
    public ContactAddressInfo homeAddress;

    /// <summary>
    /// </summary>
    public ContactAddressInfo businessAddress;

    /// <summary>
    /// </summary>
    public ContactAddressInfo otherAddress;
}
