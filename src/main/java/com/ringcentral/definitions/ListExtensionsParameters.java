package com.ringcentral.definitions;


public class ListExtensionsParameters {
    /// <summary>
    /// Extension number to retrieve
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Extension email address
    /// </summary>
    public String email;

    /// <summary>
    /// Indicates the page number to retrieve. Only positive number values are allowed
    /// Default: 1
    /// </summary>
    public Long page;

    /// <summary>
    /// Indicates the page size (number of items)
    /// Default: 100
    /// </summary>
    public Long perPage;

    /// <summary>
    /// Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without extensionNumber are returned. If not specified, then all extensions are returned.
    /// </summary>
    public String[] status;

    /// <summary>
    /// Extension type. Multiple values are supported
    /// </summary>
    public String[] type;
}
