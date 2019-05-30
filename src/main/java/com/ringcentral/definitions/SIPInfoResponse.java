package com.ringcentral.definitions;


public class SIPInfoResponse {
    /**
     * User credentials
     */
    public String username;

    /**
     * User password
     */
    public String password;

    /**
     * Identifier for SIP authorization
     */
    public String authorizationId;

    /**
     * SIP domain
     */
    public String domain;

    /**
     * SIP outbound proxy
     */
    public String outboundProxy;

    /**
     * Preferred transport. SIP info will be returned for this transport if supported
     * Enum: UDP, TCP, TLS, WS, WSS
     */
    public String transport;

    /**
     * For TLS transport only Base64 encoded certificate
     */
    public String certificate;

    /**
     * The interval in seconds after which the app must try to switch back to primary proxy if it was previously switched to backup. If this parameter is not returned, the app must stay on backup proxy and try to switch to primary proxy after the next SIP-provision call.
     */
    public Long switchBackInterval;
}
