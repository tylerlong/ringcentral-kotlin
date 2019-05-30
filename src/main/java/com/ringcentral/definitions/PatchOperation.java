package com.ringcentral.definitions;


public class PatchOperation {
    /// <summary>
    /// Required
    /// Enum: add, replace, remove
    /// </summary>
    public String op;

    /// <summary>
    /// </summary>
    public String path;

    /// <summary>
    /// corresponding 'value' of that field specified by 'path'
    /// </summary>
    public String value;
}
