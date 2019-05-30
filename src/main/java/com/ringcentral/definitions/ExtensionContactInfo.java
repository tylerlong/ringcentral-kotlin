package com.ringcentral.definitions;


public class ExtensionContactInfo {
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
    /// Email of extension user
    /// </summary>
    public String email;

    /// <summary>
    /// Extension user contact phone number
    /// </summary>
    public String businessPhone;

    /// <summary>
    /// Business address of extension user company
    /// </summary>
    public ContactAddressInfo businessAddress;
}
