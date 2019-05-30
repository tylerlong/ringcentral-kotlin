package com.ringcentral.definitions;


public class IVRMenuInfo {
    /// <summary>
    /// Internal identifier of an IVR Menu extension
    /// </summary>
    public String id;

    /// <summary>
    /// Link to an IVR Menu extension resource
    /// </summary>
    public String uri;

    /// <summary>
    /// First name of an IVR Menu user
    /// </summary>
    public String name;

    /// <summary>
    /// Number of an IVR Menu extension
    /// </summary>
    public String extensionNumber;

    /// <summary>
    /// Prompt metadata
    /// </summary>
    public IVRMenuPromptInfo prompt;

    /// <summary>
    /// Keys handling settings
    /// </summary>
    public IVRMenuActionsInfo[] actions;
}
