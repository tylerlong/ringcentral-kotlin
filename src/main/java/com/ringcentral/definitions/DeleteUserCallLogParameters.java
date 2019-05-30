package com.ringcentral.definitions;


public class DeleteUserCallLogParameters {
    /// <summary>
    /// The end datetime for records deletion in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
    /// </summary>
    public String dateTo;

    /// <summary>
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// </summary>
    public String[] type;

    /// <summary>
    /// </summary>
    public String[] direction;

    /// <summary>
    /// </summary>
    public String dateFrom;
}
