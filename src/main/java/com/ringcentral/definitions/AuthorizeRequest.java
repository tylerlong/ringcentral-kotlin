package com.ringcentral.definitions;


public class AuthorizeRequest {
    /// <summary>
    /// Determines authorization flow: **code** - Authorization Code, **token** - Implicit Grant
    /// Enum: code, token
    /// </summary>
    public String response_type;

    /// <summary>
    /// This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
    /// </summary>
    public String redirect_uri;

    /// <summary>
    /// Identifier (key) of a client application
    /// </summary>
    public String client_id;

    /// <summary>
    /// Client state. Returned back to the client at the end of the flow
    /// </summary>
    public String state;

    /// <summary>
    /// Brand identifier. If it is not provided in request, server will try to determine brand from client app profile. The default value is '1210' - RingCentral US
    /// </summary>
    public String brand_id;

    /// <summary>
    /// Style of login form. The default value is 'page'. The 'popup' and 'touch' values are featured for mobile applications
    /// Enum: page, popup, touch, mobile
    /// </summary>
    public String display;

    /// <summary>
    /// Specifies which login form will be displayed. Space-separated set of the following values: 'login' - official RingCentral login form, 'sso' - Single Sign-On login form, 'consent' - form to show the requested scope and prompt user for consent. Either 'login' or 'sso' (or both) must be specified. The default value is 'login&sso'
    /// Enum: login, sso, consent
    /// </summary>
    public String prompt;

    /// <summary>
    /// Localization code of a language. Overwrites 'Accept-Language' header value
    /// </summary>
    public String localeId;

    /// <summary>
    /// Localization code of a language. Overwrites 'localeId' parameter value
    /// </summary>
    public String ui_locales;

    /// <summary>
    /// User interface options data
    /// Enum: hide_logo, hide_tos, hide_remember_me, external_popup, old_ui
    /// </summary>
    public String ui_options;
}
