package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class ConferencePhoneNumberInfo {
    /// <summary>
    /// Dial-in phone number to connect to a conference
    /// </summary>
    public String phoneNumber;

    /// <summary>
    /// 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
    /// </summary>
    @JSONField(name = "default")
    public Boolean _default;
}
