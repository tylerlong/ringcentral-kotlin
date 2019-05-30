package com.ringcentral.definitions;


public class LocationInfo {
    /// <summary>
    /// Canonical URI of a location
    /// </summary>
    public String uri;

    /// <summary>
    /// Area code of the location
    /// </summary>
    public String areaCode;

    /// <summary>
    /// Official name of the city, belonging to the certain state
    /// </summary>
    public String city;

    /// <summary>
    /// Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
    /// </summary>
    public String npa;

    /// <summary>
    /// Central office code of the location, according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
    /// </summary>
    public String nxx;

    /// <summary>
    /// ID and URI of the state this location belongs to, see State Info
    /// </summary>
    public String state;
}
