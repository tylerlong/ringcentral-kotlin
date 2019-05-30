package com.ringcentral.definitions;


public class LocationInfo {
    /**
     * Canonical URI of a location
     */
    public String uri;

    /**
     * Area code of the location
     */
    public String areaCode;

    /**
     * Official name of the city, belonging to the certain state
     */
    public String city;

    /**
     * Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
     */
    public String npa;

    /**
     * Central office code of the location, according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
     */
    public String nxx;

    /**
     * ID and URI of the state this location belongs to, see State Info
     */
    public String state;
}
