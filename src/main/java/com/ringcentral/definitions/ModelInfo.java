package com.ringcentral.definitions;


public class ModelInfo {
    /**
     * Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
     */
    public String id;

    /**
     * Device name
     */
    public String name;

    /**
     * Addons description
     * Required
     */
    public AddonInfo[] addons;

    /**
     * Device feature or multiple features supported
     */
    public String[] features;
}
