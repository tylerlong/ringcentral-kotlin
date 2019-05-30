package com.ringcentral.definitions;


public class GetStateInfoResponse {
    /// <summary>
    /// Internal identifier of a state
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a state
    /// </summary>
    public String uri;

    /// <summary>
    /// Information on a country the state belongs to
    /// </summary>
    public GetCountryInfoState country;

    /// <summary>
    /// Short code for a state (2-letter usually)
    /// </summary>
    public String isoCode;

    /// <summary>
    /// Official name of a state
    /// </summary>
    public String name;
}
