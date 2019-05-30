package com.ringcentral.definitions;


public class FaxCoverPageInfo {
    /// <summary>
    /// Internal identifier of a fax cover page. The possible value range is 0-13 (for language setting en-US) and 0, 15-28 (for all other languages)
    /// </summary>
    public Long id;

    /// <summary>
    /// Name of a fax cover page pattern
    /// </summary>
    public String name;
}
