package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class UserResponse {
    /**
     * user status
     */
    public Boolean active;

    /**
     *
     */
    public UserAddress[] addresses;

    /**
     * Required
     */
    public Email[] emails;

    /**
     * external unique resource id defined by provisioning client
     */
    public String externalId;

    /**
     * unique resource id defined by RingCentral
     */
    public String id;

    /**
     * Required
     */
    public Name name;

    /**
     *
     */
    public PhoneNumber[] phoneNumbers;

    /**
     *
     */
    public Photo[] photos;

    /**
     * Required
     */
    public String[] schemas;

    /**
     *
     */
    @JSONField(name = "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;

    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;

    /**
     *
     */
    public Meta meta;
}
