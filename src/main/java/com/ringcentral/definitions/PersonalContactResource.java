package com.ringcentral.definitions;


public class PersonalContactResource {
    /**
     * Canonical URI of the contact
     */
    public String uri;

    /**
     * This property has a special meaning only on Address Book Sync (e.g. a contact can be `Deleted`). For simple contact list reading it has always the default value - `Alive`
     * Enum: Alive, Deleted, Purged
     */
    public String availability;

    /**
     * Email of the contact
     */
    public String email;

    /**
     *
     */
    public String id;

    /**
     * Notes for the contact
     */
    public String notes;

    /**
     * Company name of the contact
     */
    public String company;

    /**
     * First name of the contact
     */
    public String firstName;

    /**
     * Last name of the contact
     */
    public String lastName;

    /**
     * Job title of the contact
     */
    public String jobTitle;

    /**
     * Date of birth of the contact
     */
    public String birthday;

    /**
     * The contact home page URL
     */
    public String webPage;

    /**
     * Middle name of the contact
     */
    public String middleName;

    /**
     * Nick name of the contact
     */
    public String nickName;

    /**
     * 2nd email of the contact
     */
    public String email2;

    /**
     * 3rd email of the contact
     */
    public String email3;

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
    public ContactAddressInfo businessAddress;

    /**
     *
     */
    public ContactAddressInfo homeAddress;

    /**
     *
     */
    public ContactAddressInfo otherAddress;
}
