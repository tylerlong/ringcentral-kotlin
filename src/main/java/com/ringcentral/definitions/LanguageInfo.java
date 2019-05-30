package com.ringcentral.definitions;


public class LanguageInfo {
    /// <summary>
    /// Internal identifier of a language
    /// </summary>
    public String id;

    /// <summary>
    /// Canonical URI of a language
    /// </summary>
    public String uri;

    /// <summary>
    /// Indicates whether a language is available as greeting language
    /// </summary>
    public Boolean greeting;

    /// <summary>
    /// Indicates whether a language is available as formatting locale
    /// </summary>
    public Boolean formattingLocale;

    /// <summary>
    /// Localization code of a language
    /// </summary>
    public String localeCode;

    /// <summary>
    /// Official name of a language
    /// </summary>
    public String name;

    /// <summary>
    /// Indicates whether a language is available as UI language
    /// </summary>
    public Boolean ui;
}
