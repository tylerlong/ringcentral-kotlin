package com.ringcentral.definitions;


public class PatchOperation {
    /**
     * Required
     * Enum: add, replace, remove
     */
    public String op;

    /**
     *
     */
    public String path;

    /**
     * corresponding 'value' of that field specified by 'path'
     */
    public String value;
}
