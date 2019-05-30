package com.ringcentral.definitions;


public class PersonalContactRequest {
    /**
     * First name of the contact
     */
    public String firstName;

    /**
     * Last name of the contact
     */
    public String lastName;

    /**
     * Middle name of the contact
     */
    public String middleName;

    /**
     * Nick name of the contact
     */
    public String nickName;

    /**
     * Company name of the contact
     */
    public String company;

    /**
     * Job title of the contact
     */
    public String jobTitle;

    /**
     * Email of the contact
     */
    public String email;

    /**
     * 2nd email of the contact
     */
    public String email2;

    /**
     * 3rd email of the contact
     */
    public String email3;

    /**
     * Date of birth of the contact
     */
    public String birthday;

    /**
     * The contact home page URL
     */
    public String webPage;

    /**
     * Notes for the contact
     */
    public String notes;

    /**
     * Home phone number of the contact in e.164 (with "+") format
     */
    public String homePhone;

    /**
     * 2nd home phone number of the contact in e.164 (with "+") format
     */
    public String homePhone2;

    /**
     * Business phone of the contact in e.164 (with "+") format
     */
    public String businessPhone;

    /**
     * 2nd business phone of the contact in e.164 (with "+") format
     */
    public String businessPhone2;

    /**
     * Mobile phone of the contact in e.164 (with "+") format
     */
    public String mobilePhone;

    /**
     * Business fax number of the contact in e.164 (with "+") format
     */
    public String businessFax;

    /**
     * Company number of the contact in e.164 (with "+") format
     */
    public String companyPhone;

    /**
     * Phone number of the contact assistant in e.164 (with "+") format
     */
    public String assistantPhone;

    /**
     * Car phone number of the contact in e.164 (with "+") format
     */
    public String carPhone;

    /**
     * Other phone number of the contact in e.164 (with "+") format
     */
    public String otherPhone;

    /**
     * Other fax number of the contact in e.164 (with "+") format
     */
    public String otherFax;

    /**
     * Callback phone number of the contact in e.164 (with "+") format
     */
    public String callbackPhone;

    /**
     *
     */
    public ContactAddressInfo homeAddress;

    /**
     *
     */
    public ContactAddressInfo businessAddress;

    /**
     *
     */
    public ContactAddressInfo otherAddress;
}
