package com.ringcentral.definitions;


public class ModelInfo {
    /// <summary>
    /// Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
    /// </summary>
    public String id;

    /// <summary>
    /// Device name
    /// </summary>
    public String name;

    /// <summary>
    /// Addons description
    /// Required
    /// </summary>
    public AddonInfo[] addons;

    /// <summary>
    /// Device feature or multiple features supported
    /// </summary>
    public String[] features;
}
