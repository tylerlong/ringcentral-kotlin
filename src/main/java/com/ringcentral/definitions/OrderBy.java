package com.ringcentral.definitions;


public class OrderBy {
    /**
     * Sorting priority index, starting from '1'. Optional if only one element in `orderBy` array is specified
     */
    public Long index;

    /**
     * Field name by which to sort the contacts
     * Enum: firstName, lastName, extensionNumber, phoneNumber, email
     */
    public String fieldName;

    /**
     * Sorting direction
     * Enum: Asc, Desc
     */
    public String direction;
}
