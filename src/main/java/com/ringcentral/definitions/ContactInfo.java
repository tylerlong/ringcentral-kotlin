package com.ringcentral.definitions;


public class ContactInfo {
    /**
     * For User extension type only. Extension user first name
     * Required
     */
    public String firstName;

    /**
     * For User extension type only. Extension user last name
     */
    public String lastName;

    /**
     * Extension user company name
     */
    public String company;

    /**
     *
     */
    public String jobTitle;

    /**
     * Email of extension user
     * Required
     */
    public String email;

    /**
     * Extension user contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
     */
    public String businessPhone;

    /**
     * Extension user mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
     */
    public String mobilePhone;

    /**
     * Business address of extension user company
     */
    public ContactBusinessAddressInfo businessAddress;

    /**
     * If 'True' then contact email is enabled as login name for this user. Please note that email should be unique in this case.
     * Default: False
     */
    public Boolean emailAsLoginName;

    /**
     *
     */
    public PronouncedNameInfo pronouncedName;

    /**
     * Extension user department, if any
     */
    public String department;
}
