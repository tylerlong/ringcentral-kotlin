package com.ringcentral.definitions;


public class GetServiceInfoResponse {
    /// <summary>
    /// Canonical URI of the account Service Info resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Account Service Plan name
    /// </summary>
    public String servicePlanName;

    /// <summary>
    /// Service features information, see Service Feature List
    /// </summary>
    public ServiceFeatureInfo[] serviceFeatures;

    /// <summary>
    /// Limits which are effective for the account
    /// </summary>
    public AccountLimits limits;
}
