package com.ringcentral.definitions;


public class NotificationRecipientInfo {
    /// <summary>
    /// Phone number in E.164 (with '+' sign) format
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// Extension number
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// 'True' specifies that message is sent exactly to this recipient. Returned in to field for group MMS. Useful if one extension has several phone numbers
    /// </summary>
    public Boolean target;

    /// <summary>
    /// Contains party location (city, state) if one can be determined from phoneNumber. This property is filled only when phoneNumber is not empty and server can calculate location information from it (for example, this information is unavailable for US toll-free numbers)
    /// </summary>
    public String location;

    /// <summary>
    /// Symbolic name associated with a caller/callee. If the phone does not belong to the known extension, only the location is returned, the name is not determined then
    /// </summary>
    public String name;
}
