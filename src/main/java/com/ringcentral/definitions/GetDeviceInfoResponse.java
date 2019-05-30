package com.ringcentral.definitions;


public class GetDeviceInfoResponse {
    /// <summary>
    /// Internal identifier of a device
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a device
    /// </summary>
    public String uri;

    /// <summary>
    /// Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example 'HP-56-2-2'
    /// </summary>
    public String sku;

    /// <summary>
    /// Device type
    /// Default: HardPhone
    /// Enum: SoftPhone, OtherPhone, HardPhone
    /// </summary>
    public String type;

    /// <summary>
    /// Device name. Mandatory if ordering  SoftPhone  or  OtherPhone . Optional for  HardPhone . If not specified for HardPhone, then device  model  name is used as device  name
    /// </summary>
    public String name;

    /// <summary>
    /// Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications
    /// </summary>
    public String serial;

    /// <summary>
    /// PC name for softphone
    /// </summary>
    public String computerName;

    /// <summary>
    /// HardPhone model information
    /// </summary>
    public ModelInfo model;

    /// <summary>
    /// This attribute can be omitted for unassigned devices
    /// </summary>
    public ExtensionInfoIntId extension;

    /// <summary>
    /// Address for emergency cases. The same emergency address is assigned to all the numbers of one device
    /// </summary>
    public EmergencyAddressInfo emergencyServiceAddress;

    /// <summary>
    /// Phone lines information
    /// </summary>
    public PhoneLinesInfo[] phoneLines;

    /// <summary>
    /// Shipping information, according to which devices (in case of  HardPhone ) or e911 stickers (in case of  SoftPhone  and  OtherPhone ) will be delivered to the customer
    /// </summary>
    public ShippingInfo shipping;

    /// <summary>
    /// Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. EitherT? model  structure, or  boxBillingId  must be specified forT?HardPhone
    /// </summary>
    public Long boxBillingId;

    /// <summary>
    /// Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
    /// </summary>
    public Boolean useAsCommonPhone;

    /// <summary>
    /// Network location status. 'True' if the device is located in the configured corporate network (On-Net); 'False' for Off-Net location. Parameter is not returned if `EmergencyAddressAutoUpdate` feature is not enabled for the account/user, or if device network location is not determined
    /// </summary>
    public Boolean inCompanyNet;

    /// <summary>
    /// Site data
    /// </summary>
    public DeviceSiteInfo site;
}
