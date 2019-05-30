package com.ringcentral.definitions;


public class ContactResource {
    /**
     *
     */
    public AccountResource account;

    /**
     *
     */
    public String department;

    /**
     *
     */
    public String email;

    /**
     *
     */
    public String extensionNumber;

    /**
     * First name of a contact, for user extensions only
     */
    public String firstName;

    /**
     * Last name of a contact, for user extensions only
     */
    public String lastName;

    /**
     * Name of a contact, for non-user extensions
     */
    public String name;

    /**
     *
     */
    public String id;

    /**
     *
     */
    public String jobTitle;

    /**
     *
     */
    public PhoneNumberResource[] phoneNumbers;

    /**
     *
     */
    public AccountDirectoryProfileImageResource profileImage;

    /**
     *
     */
    public BusinessSiteResource site;

    /**
     *
     */
    public String status;

    /**
     *
     */
    public String type;
}
