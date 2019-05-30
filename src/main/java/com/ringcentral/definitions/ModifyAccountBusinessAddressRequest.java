package com.ringcentral.definitions;


public class ModifyAccountBusinessAddressRequest {
    /// <summary>
    /// Company business name
    /// </summary>
    public String company;

    /// <summary>
    /// Company business email address
    /// </summary>
    public String email;

    /// <summary>
    /// Company business address
    /// Required
    /// </summary>
    public BusinessAddressInfo businessAddress;
}
