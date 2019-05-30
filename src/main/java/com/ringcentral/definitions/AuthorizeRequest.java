package com.ringcentral.definitions;


public class AuthorizeRequest {
    /**
     * Determines authorization flow: **code** - Authorization Code, **token** - Implicit Grant
     * Enum: code, token
     */
    public String response_type;

    /**
     * This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
     */
    public String redirect_uri;

    /**
     * Identifier (key) of a client application
     */
    public String client_id;

    /**
     * Client state. Returned back to the client at the end of the flow
     */
    public String state;

    /**
     * Brand identifier. If it is not provided in request, server will try to determine brand from client app profile. The default value is '1210' - RingCentral US
     */
    public String brand_id;

    /**
     * Style of login form. The default value is 'page'. The 'popup' and 'touch' values are featured for mobile applications
     * Enum: page, popup, touch, mobile
     */
    public String display;

    /**
     * Specifies which login form will be displayed. Space-separated set of the following values: 'login' - official RingCentral login form, 'sso' - Single Sign-On login form, 'consent' - form to show the requested scope and prompt user for consent. Either 'login' or 'sso' (or both) must be specified. The default value is 'login&sso'
     * Enum: login, sso, consent
     */
    public String prompt;

    /**
     * Localization code of a language. Overwrites 'Accept-Language' header value
     */
    public String localeId;

    /**
     * Localization code of a language. Overwrites 'localeId' parameter value
     */
    public String ui_locales;

    /**
     * User interface options data
     * Enum: hide_logo, hide_tos, hide_remember_me, external_popup, old_ui
     */
    public String ui_options;
}
