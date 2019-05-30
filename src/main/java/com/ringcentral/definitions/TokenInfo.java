package com.ringcentral.definitions;


public class TokenInfo {
    /**
     * Access token to pass to subsequent API requests
     */
    public String access_token;

    /**
     * Issued access token TTL (time to live), in seconds
     */
    public Long expires_in;

    /**
     * Refresh token to get a new access token, when the issued one expires
     */
    public String refresh_token;

    /**
     * Issued refresh token TTL (time to live), in seconds
     */
    public Long refresh_token_expires_in;

    /**
     * List of permissions allowed with this access token, white-space separated
     */
    public String scope;

    /**
     * Type of token. The only possible value supported is Bearer. This value should be used when specifying access token in Authorization header of subsequent API requests
     */
    public String token_type;

    /**
     * Extension identifier
     */
    public String owner_id;

    /**
     * Application instance identifier
     */
    public String endpoint_id;
}
