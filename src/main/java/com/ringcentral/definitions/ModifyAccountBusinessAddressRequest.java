package com.ringcentral.definitions;


public class ModifyAccountBusinessAddressRequest {
    /**
     * Company business name
     */
    public String company;

    /**
     * Company business email address
     */
    public String email;

    /**
     * Company business address
     * Required
     */
    public BusinessAddressInfo businessAddress;
}
