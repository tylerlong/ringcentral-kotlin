package com.ringcentral.definitions;


public class GetTokenRequest {
    /**
     * Phone number linked to an account or extension in E.164 format with or without leading '+' sign
     */
    public String username;

    /**
     * User's password
     */
    public String password;

    /**
     * Optional. Extension short number. If company number is specified as a username, and extension is not specified, the server will attempt to authenticate client as main company administrator
     */
    public String extension;

    /**
     * Grant type
     * Default: password
     * Enum: authorization_code, password, refresh_token, client_credentials
     */
    public String grant_type;

    /**
     * Authorization code
     */
    public String code;

    /**
     * This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
     */
    public String redirect_uri;

    /**
     * Access token lifetime in seconds
     * Maximum: 3600
     * Minimum: 600
     * Default: 3600
     */
    public Long access_token_ttl;

    /**
     * Refresh token lifetime in seconds
     * Maximum: 604800
     * Default: 604800
     */
    public Long refresh_token_ttl;

    /**
     * List of API permissions to be used with access token. Can be omitted when requesting all permissions defined during the application registration phase
     */
    public String scope;

    /**
     * Previously issued refresh token. This is the only formData field used for the Refresh Token Flow.
     */
    public String refresh_token;

    /**
     * The unique identifier of a client application. If not specified, the previously specified or auto generated value is used by default
     */
    public String endpoint_id;
}
