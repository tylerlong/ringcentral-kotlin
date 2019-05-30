package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class UserResponse {
    /// <summary>
    /// user status
    /// </summary>
    public Boolean active;

    /// <summary>
    /// </summary>
    public UserAddress[] addresses;

    /// <summary>
    /// Required
    /// </summary>
    public Email[] emails;

    /// <summary>
    /// external unique resource id defined by provisioning client
    /// </summary>
    public String externalId;

    /// <summary>
    /// unique resource id defined by RingCentral
    /// </summary>
    public String id;

    /// <summary>
    /// Required
    /// </summary>
    public Name name;

    /// <summary>
    /// </summary>
    public PhoneNumber[] phoneNumbers;

    /// <summary>
    /// </summary>
    public Photo[] photos;

    /// <summary>
    /// Required
    /// </summary>
    public String[] schemas;

    /// <summary>
    /// </summary>
    @JSONField(name = "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;

    /// <summary>
    /// MUST be same as work type email address
    /// Required
    /// </summary>
    public String userName;

    /// <summary>
    /// </summary>
    public Meta meta;
}
