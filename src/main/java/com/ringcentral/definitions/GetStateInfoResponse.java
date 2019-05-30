package com.ringcentral.definitions;


public class GetStateInfoResponse {
    /**
     * Internal identifier of a state
     */
    public String id;

    /**
     * Canonical URI of a state
     */
    public String uri;

    /**
     * Information on a country the state belongs to
     */
    public GetCountryInfoState country;

    /**
     * Short code for a state (2-letter usually)
     */
    public String isoCode;

    /**
     * Official name of a state
     */
    public String name;
}
