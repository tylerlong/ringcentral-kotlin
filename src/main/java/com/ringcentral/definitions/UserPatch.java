package com.ringcentral.definitions;


public class UserPatch {
    /// <summary>
    /// patch operations list
    /// Required
    /// </summary>
    public PatchOperation[] Operations;

    /// <summary>
    /// Required
    /// </summary>
    public String[] schemas;
}
