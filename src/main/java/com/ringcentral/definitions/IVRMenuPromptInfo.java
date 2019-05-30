package com.ringcentral.definitions;


public class IVRMenuPromptInfo {
    /**
     * Prompt mode: custom media or text
     * Enum: Audio, TextToSpeech
     */
    public String mode;

    /**
     * For 'Audio' mode only. Prompt media reference
     */
    public PromptLanguageInfo audio;

    /**
     * For 'TextToSpeech' mode only. Prompt text
     */
    public String text;

    /**
     * For 'TextToSpeech' mode only. Prompt language metadata
     */
    public AudioPromptInfo language;
}
