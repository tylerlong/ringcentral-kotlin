package com.ringcentral.definitions;


public class ContactInfoUpdateRequest {
    /// <summary>
    /// For User extension type only. Extension user first name
    /// </summary>
    public String firstName;

    /// <summary>
    /// For User extension type only. Extension user last name
    /// </summary>
    public String lastName;

    /// <summary>
    /// Extension user company name
    /// </summary>
    public String company;

    /// <summary>
    /// </summary>
    public String jobTitle;

    /// <summary>
    /// Email of extension user
    /// </summary>
    public String email;

    /// <summary>
    /// Extension user contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
    /// </summary>
    public String businessPhone;

    /// <summary>
    /// Extension user mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
    /// </summary>
    public String mobilePhone;

    /// <summary>
    /// </summary>
    public ContactBusinessAddressInfo businessAddress;

    /// <summary>
    /// If 'True' then contact email is enabled as login name for this user. Please note that email should be unique in this case. The default value is 'False'
    /// </summary>
    public Boolean emailAsLoginName;

    /// <summary>
    /// </summary>
    public PronouncedNameInfo pronouncedName;

    /// <summary>
    /// Extension user department, if any
    /// </summary>
    public String department;
}
