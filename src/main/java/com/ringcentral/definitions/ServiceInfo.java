package com.ringcentral.definitions;


public class ServiceInfo {
    /// <summary>
    /// Canonical URI of a service info resource
    /// </summary>
    public String uri;

    /// <summary>
    /// Information on account billing plan
    /// </summary>
    public BillingPlanInfo billingPlan;

    /// <summary>
    /// Information on account brand
    /// </summary>
    public BrandInfo brand;

    /// <summary>
    /// Information on account service plan
    /// </summary>
    public ServicePlanInfo servicePlan;

    /// <summary>
    /// Information on account target service plan
    /// </summary>
    public TargetServicePlanInfo targetServicePlan;
}
