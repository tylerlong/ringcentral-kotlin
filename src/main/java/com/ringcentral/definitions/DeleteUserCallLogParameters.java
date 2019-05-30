package com.ringcentral.definitions;


public class DeleteUserCallLogParameters {
    /**
     * The end datetime for records deletion in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     */
    public String dateTo;

    /**
     *
     */
    public String phoneNumber;

    /**
     *
     */
    public String extensionNumber;

    /**
     *
     */
    public String[] type;

    /**
     *
     */
    public String[] direction;

    /**
     *
     */
    public String dateFrom;
}
