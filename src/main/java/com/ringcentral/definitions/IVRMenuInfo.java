package com.ringcentral.definitions;


public class IVRMenuInfo {
    /**
     * Internal identifier of an IVR Menu extension
     */
    public String id;

    /**
     * Link to an IVR Menu extension resource
     */
    public String uri;

    /**
     * First name of an IVR Menu user
     */
    public String name;

    /**
     * Number of an IVR Menu extension
     */
    public String extensionNumber;

    /**
     * Prompt metadata
     */
    public IVRMenuPromptInfo prompt;

    /**
     * Keys handling settings
     */
    public IVRMenuActionsInfo[] actions;
}
