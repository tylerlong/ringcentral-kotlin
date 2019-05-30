package com.ringcentral.definitions;


public class TokenInfo {
    /// <summary>
    /// Access token to pass to subsequent API requests
    /// </summary>
    public String access_token;

    /// <summary>
    /// Issued access token TTL (time to live), in seconds
    /// </summary>
    public Long expires_in;

    /// <summary>
    /// Refresh token to get a new access token, when the issued one expires
    /// </summary>
    public String refresh_token;

    /// <summary>
    /// Issued refresh token TTL (time to live), in seconds
    /// </summary>
    public Long refresh_token_expires_in;

    /// <summary>
    /// List of permissions allowed with this access token, white-space separated
    /// </summary>
    public String scope;

    /// <summary>
    /// Type of token. The only possible value supported is Bearer. This value should be used when specifying access token in Authorization header of subsequent API requests
    /// </summary>
    public String token_type;

    /// <summary>
    /// Extension identifier
    /// </summary>
    public String owner_id;

    /// <summary>
    /// Application instance identifier
    /// </summary>
    public String endpoint_id;
}
