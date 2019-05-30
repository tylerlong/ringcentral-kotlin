package com.ringcentral.definitions;


public class ScimErrorResponse {
    /// <summary>
    /// detail error message
    /// </summary>
    public String detail;

    /// <summary>
    /// </summary>
    public String[] schemas;

    /// <summary>
    /// bad request type when status code is 400
    /// Enum: uniqueness, tooMany, mutability, sensitive, invalidSyntax, invalidFilter, invalidPath, invalidValue, invalidVers, noTarget
    /// </summary>
    public String scimType;

    /// <summary>
    /// same as HTTP status code, e.g. 400, 401, etc.
    /// </summary>
    public String status;
}
