package com.ringcentral.definitions;


// Phone number of the called party. This number corresponds to the 2nd leg of a CallOut call
public class MakeCallOutCallerInfoRequestTo {
    /// <summary>
    /// Phone number in E.164 format
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Extension number
    /// </summary>
    public String extensionNumber;
}
