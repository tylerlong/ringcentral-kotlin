package com.ringcentral.definitions;


public class UserPatch {
    /**
     * patch operations list
     * Required
     */
    public PatchOperation[] Operations;

    /**
     * Required
     */
    public String[] schemas;
}
